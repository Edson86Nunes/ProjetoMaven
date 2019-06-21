package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbrirNavegadores {

	static WebDriver driver; // instanciando a classe webdriver

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// inserir caminho dos drivers dos navegadores

		//System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");// chamar o firefox
		 System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");//chamar  o chrome
		//driver = new FirefoxDriver();
		 driver = new ChromeDriver();

		//driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	    //driver.get("https://pt-br.facebook.com/r.php?locale=pt_BR&display=page");
	   // driver.get("http://demo.automationtesting.in/Modals.html");
		 driver.get("http://demo.automationtesting.in/Register.html");
	    
	}

	@Test
	public void preencheCadastro() {
          /*
           * para o teste de cadastro google*
		WebElement nome = driver.findElement(By.id("firstName"));
		nome.sendKeys("Edson");

		WebElement sobreNome = driver.findElement(By.id("lastName"));
		sobreNome.sendKeys("Nunes");

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("ed$ow");

		WebElement senha = driver.findElement(By.name("Passwd"));
		senha.sendKeys("12345678");

		WebElement confirmasenha = driver.findElement(By.name("ConfirmPasswd"));
		confirmasenha.sendKeys("12345678");
                
		
		
		
		// localiza com xPath
		WebElement nome = driver.findElement(By.xpath("//*[@id=\"u_0_k\"]"));
		nome.sendKeys("Edson");
		
		WebElement sobrenome = driver.findElement(By.xpath("//*[@id=\"u_0_m\"]"));
		sobrenome.sendKeys("Nunes");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"u_0_p\"]"));
		email.sendKeys("edson@gmail.com");
		
		WebElement confirmaemail = driver.findElement(By.xpath("//*[@id=\"u_0_s\"]"));
		confirmaemail.sendKeys("edson@gmail.com");
		
		
		// preenche datas
		Select selectDia = new Select(driver.findElement(By.id("day")));
		selectDia.selectByValue("3");
		
		Select selectMes = new Select(driver.findElement(By.id("month")));
		selectMes.selectByValue("10");
		
		Select selectAno = new Select(driver.findElement(By.id("year")));
		selectAno.selectByValue("1986");
	*/
		
		//Wait Explícitos e implícitos
		
		WebElement botaoModal = driver.findElement(By.xpath("/html/body/section/div[1]/div[1]/div/div[2]/a"));
		botaoModal.click();
		
		//implicito (wait para esperar o elemento aparacer na tela)
		
		WebDriverWait wait =  new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")));
		
		WebElement botaoSave = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]"));
		botaoSave.click();
		
		

		
		
		
		
		
	
		
		

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		// driver.close();// fecha apenas a aba que ele usou

		// driver.quit();// fecha tudo
	}

}
