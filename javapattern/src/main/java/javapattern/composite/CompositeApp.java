package javapattern.composite;

public class CompositeApp {

	public static void main(String[] args) {
		Folder root = new Folder("root");
		Folder home = new Folder("home");
		Folder garam = new Folder("garam");
		Folder music = new Folder("music");
		
		File track1 = new File("f1.txt");
		File track2 = new File("f2.txt");
		File pic1 = new File("pic.txt");
		File doc1 = new File("doc.txt");

		root.addComponent(home);
		
		  home.addComponent(garam);
		    garam.addComponent(pic1);
		    garam.addComponent(doc1);
		
		 garam.addComponent(music);
		   music.addComponent(track1);
		   music.addComponent(track2);

		
		showDir(root);
	}

	private static void showDir(Component component) {
		System.out.println(component.getClass().getName() + "|" + component.getName());
		if(component instanceof Folder) {
			for(Component c : ((Folder)component).getChildren()) {
				showDir(c);
			}
		}
	}
}
