package conditionalTesting.service;

public class WindowsListService implements ListService{
    @Override
    public String ShowListCommand() {
        return "dir";
    }
}
