package co.com.certificacion.RetoFortesza.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearUsuarioUI
{
    public static final Target CLICKONUSER = Target.the("click on user").located(By.id("input-email-register"));
    public static final Target CLICKONPASSWORD = Target.the("click on password").located(By.id("input-password-register"));
    public static final Target CLICKMAYOREDAD = Target.the("click on soy mayor de edad").located(By.className("mat-checkbox-layout"));
    public static final Target CLICKCREARCUENTA = Target.the("click on crear cuenta").located(By.id("btn-register-user"));
    public static final Target VERIRYMESSAGE = Target.the("click on crear cuenta").located(By.className("title"));





}
