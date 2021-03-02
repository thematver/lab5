package xyz.anomatver.lab5.commands;

import java.util.HashMap;
import java.util.Map;
/**
 * Статический класс, содержащий все команды в словаре commands.
 *
 * @author Матвей
 *
 */
public class CommandsList {
    public static final Map<String, Command> commands = new HashMap<String, Command>() {
    };
    private CommandsList() {
        super();
    }
    static {
        commands.put("show", new ShowCommand()); //works
        commands.put("add", new AddCommand()); //works
        commands.put("clear", new ClearCommand()); //works
        commands.put("execute", new ExecuteCommand()); //works
        commands.put("filter_greater_than_group_admin", new FilterGreaterThanGroupAdminCommand()); //works
        commands.put("filter_contains_name", new FilterContainsNameCommand()); //works
        commands.put("info", new InfoCommand()); //works
        commands.put("remove_by_id", new RemoveByIdCommand()); //works
        commands.put("removeAt", new RemoveAtCommand()); // works
        commands.put("removeFirst", new RemoveFirstCommand()); //works
        commands.put("shuffle", new ShuffleCommand()); //works
        commands.put("update", new UpdateCommand()); //works
        commands.put("help", new HelpCommand()); //works
        commands.put("print_field_ascending_semester_enum", new PrintFieldAscendingSemesterEnumCommand()); //works why but no one has Semester ??
        commands.put("save", new SaveCommand()); //works
        commands.put("exit", new ExitCommand()); //works
    }
}
