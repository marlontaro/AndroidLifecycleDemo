package pe.marloncordova.demoactivitylifecycle;
import android.app.Application;

public class StartupApp extends com.orm.SugarApp{

    private static StartupApp instance;


    public StartupApp() {
        super();
        instance = this;
    }

    public static StartupApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
