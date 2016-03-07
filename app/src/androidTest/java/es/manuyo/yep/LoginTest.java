package es.manuyo.yep;

/**
 * Created by manu on 07/03/2016.
 */

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;

public class LoginTest extends ActivityInstrumentationTestCase2<Login> {

    private Login actividad;
    private Button loginBtn;


    public LoginTest() {
        super(Login.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();

        loginBtn = (Button) actividad.findViewById(R.id.LoginButton);
    }


    public void testAddValues() {

        TouchUtils.clickView(this, loginBtn);

    }
}
