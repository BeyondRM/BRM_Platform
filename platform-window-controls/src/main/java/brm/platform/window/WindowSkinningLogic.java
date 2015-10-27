package brm.platform.window;
import abc.cryptology.logics.Crypto;
import brm.platform.architecture.PlatformArchitecture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;


/**
 * Window Skinning Logic.
 * @author Gregory
 */
public class WindowSkinningLogic extends Crypto {
  @Override
  public void performDecryption(DataInputStream dis) throws IOException {
    if(!PlatformArchitecture.mode.devOnly) {
    }
  }

  @Override
  public void performEncryption(DataOutputStream dos) throws IOException {
    if(PlatformArchitecture.mode.devOnly) {
    }
  }
}
