
import javax.swing.JPanel;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class KeyCheckPane extends JPanel{
	public KeyCheckPane() {
		try {
		      GlobalScreen.registerNativeHook();
		    }
		    catch (NativeHookException ex) {
		      System.err.println("There was a problem registering the native hook.");
		      System.err.println(ex.getMessage());
		      System.exit(1);
		    }
		    GlobalScreen.addNativeKeyListener(new KeyHooker());
	}
	public class KeyHooker implements NativeKeyListener {
		  public void nativeKeyPressed(NativeKeyEvent e) {
		    System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
		  }

		  public void nativeKeyReleased(NativeKeyEvent e) {
		  }

		  public void nativeKeyTyped(NativeKeyEvent e) {
		  }
		}
}
