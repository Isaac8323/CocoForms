package Frijoles;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "loginBean")
@ApplicationScoped
public class loginBean {

    private int activeindex;

    public int getActiveindex() {
        return activeindex;
    }

    public void setActiveindex(int activeindex) {
        this.activeindex = activeindex;
    }

    public String Dirige(int a) {
        setActiveindex(a);
        String url = "#";
        if (a == 1) {
            url = "login.xhtml";
        }
        if (a == 2) {
            url = "userpage.xhtml";
        }
        return url;
    }
}
