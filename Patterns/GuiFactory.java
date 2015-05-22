public interface GuiFactory {
    public Window createWindow();

    public Button createButton();
}

public class GuiFactories {
    private GuiFactory() {}

    public static GuiFactory getByOs() {
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Windows")) {
            return new WindowsGuiFactory();
        }
        if (osName.startsWith("Mac")) {
            return new MacGuiFactory();
        }
        if (osName.startsWith("Linux")) {
            return new LinuxGuiFactory();
        }
        throw new RuntimeException("Incompatible OS");
    }
}