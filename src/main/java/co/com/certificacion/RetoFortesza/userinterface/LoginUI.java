package co.com.certificacion.RetoFortesza.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI
{
    public static final Target CLICKONINICIARSESION = Target.the("click on iniciar sesion").located(By.id("btn-sign-in-page"));

    public static final Target CLICKONEMAILLOGIN = Target.the("click on user").located(By.id("txt-email-or-user"));
    public static final Target CLICKONPASSWORDLOGIN = Target.the("click on password").located(By.id("txt-password"));
    public static final Target CLICKONBUTTON = Target.the("click on BUTTON").located(By.xpath("(//button[@class = 'mat-menu-trigger dropbtn'])"));
    public static final Target CLICKONFACTORING = Target.the("click on factoring").located(By.xpath("(//div[@class = 'ng-tns-c122-0 ng-star-inserted'])[2]"));
    public static final Target CLICKONRECARGARSALDO = Target.the("click on RECARGAR SALDO").located(By.xpath("(//button[@class = 'mat-focus-indicator btn btn-blue-light mat-raised-button mat-button-base'])"));
    public static final Target VERIFICARRECARGARSALDO = Target.the("Verificar saldo").located(By.xpath("(//p[@class = 'title-t text-green-dark'])[1]"));






}
