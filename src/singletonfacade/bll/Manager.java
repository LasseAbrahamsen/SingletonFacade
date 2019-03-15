package singletonfacade.bll;

import singletonfacade.bll.IMechaChatLogicFacade;

public class Manager {
    
    private static Manager firstInstance = null;
    
    private Manager () {
        
    }
    
    public static Manager getInstance() {
        if (firstInstance == null) {
            firstInstance = new Manager();
        }
        return firstInstance;
    }
    
    //:thinking:
    
}
