package launcher;

//import com.apple.eawt.AboutHandler;
//import com.apple.eawt.AppEvent.AboutEvent;
//import com.apple.eawt.Application;
import presentacion.Pubs;


public class Launcher {
    private static Launcher yo=null;
    //public Application a = Application.getApplication();
    
      public static Launcher getInstance(){
        if(yo==null) {
              yo= new Launcher();
          }
        return yo;
    }
    
    
    private Launcher(){
        
    }
    
    public static void main(String[] args) {
        String osnom=System.getProperty("os.name");
        if( osnom.equals("Mac OS X")) {
            System.setProperty( "com.apple.mrj.application.apple.menu.about.name", "Pubs" );
        }
         getInstance().initApp();
    }
    
    
    public void initApp(){ 
         String osnom=System.getProperty("os.name");
        if( osnom.equals("Mac OS X")) {
            new Launcher().MacOs();
        }
        else {
            new Pubs().setVisible(true);
        }
        

    }
    
    public void MacOs(){
       
        
                
        //a.setDockIconBadge("1");
   //     com.apple.eawt.Application macApp = com.apple.eawt.Application.getApplication();
       // macApp.setDockIconImage(new ImageIcon(getClass().getResource ("/Recursos/Imagenes/gobox.png")).getImage());
        
//        a.setAboutHandler(new AboutHandler() {
//            @Override
//            public void handleAbout(AboutEvent arg0) {
//                       // new AcercaDe().setVisible(true);
//                    }
//
//                });
  
       System.setProperty("apple.laf.useScreenMenuBar", "true"); 
       Pubs app = new Pubs();
//       PopupMenu pop= new PopupMenu("hola");
//       pop.add(new CheckboxMenuItem("hola2"));
//       a.setDockMenu(pop);
       app.setVisible(true);
       String osnom = System.getProperty("os.name");
        if (osnom.equals("Mac OS X")) {
    //        Launcher.getInstance().a.requestUserAttention(true);
        }
      
        
    }
    
    public void Linux(){
    
    }
    
    public void Windows(){
    
    }
    
    
    

    


}
