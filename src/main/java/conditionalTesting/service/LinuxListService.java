package conditionalTesting.service;

public class LinuxListService implements ListService {
    @Override
    public String ShowListCommand() {
        return "ls";
    }
}
