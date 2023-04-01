package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class LinkedInBot {
    public void loginfailed(String username, String password) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
        driver.manage().window().maximize();
        System.out.println("Browser has been opened");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
        driver.findElement(By.xpath("//*[text()='My Network']")).click();
//        driver.findElement(By.xpath("//*[text()='Show more']")).click();
        Thread.sleep(4000);
        try{
            driver.findElement(By.xpath("//*[text()='Show more']")).click();
            Thread.sleep(2000);
            WebElement footer = driver.findElement(By.xpath("//footer[@class='artdeco-card__actions mn-invitations-preview__see-all']"));
            footer.findElement(By.tagName("button")).click();
            Thread.sleep(2000);
            List<WebElement> Buttons = driver.findElements(By.tagName("button"));
            System.out.println(Buttons.size());
            for (int i = 0; i<Buttons.size();i++){
                System.out.println(Buttons.get(i).getText());
                try{
                    if(Buttons.get(i).getText().equalsIgnoreCase("Accept")){
                        String s = Buttons.get(i).getAttribute("aria-label");
                        if(s != null && s.length()>6){
                            if(s.substring(0,6).equalsIgnoreCase("Accept")){
                                Buttons.get(i).click();
                                Thread.sleep(2000);
                                System.out.println("Request Accepted");
                                Buttons.remove(i);
                            }
                        }
                    }
                }
                catch(ElementClickInterceptedException exception){
                    Buttons.add(Buttons.get(i));
                }
                catch (StaleElementReferenceException ex){
                    if(Buttons.get(i).getText().equalsIgnoreCase("Accept")){
                        String s = Buttons.get(i).getAttribute("aria-label");
                        if(s != null && s.length()>6){
                            if(s.substring(0,6).equalsIgnoreCase("Accept")){
                                Buttons.get(i).click();
                                Thread.sleep(2000);
                                System.out.println("Request Accepted");
                                Buttons.remove(i);
                                Buttons.clear();
                                driver.navigate().refresh();
                                Thread.sleep(2000);
                                Buttons = driver.findElements(By.tagName("button"));
                            }
                        }
                    }
                }
            }
        }
        catch (NoSuchElementException e){
            List<WebElement> Buttons = driver.findElements(By.tagName("button"));
            System.out.println(Buttons.size());
            for (int i = 0; i<Buttons.size();i++){
                System.out.println(Buttons.get(i).getText());
                try{
                    if(Buttons.get(i).getText().equalsIgnoreCase("Accept")){
                        String s = Buttons.get(i).getAttribute("aria-label");
                        if(s != null && s.length()>6){
                            if(s.substring(0,6).equalsIgnoreCase("Accept")){
                                Buttons.get(i).click();
                                Thread.sleep(2000);
                                System.out.println("Request Accepted");
                                Buttons.remove(i);
                            }
                        }
                    }
                }
                catch(ElementClickInterceptedException exception){
                    Buttons.add(Buttons.get(i));
                }
                catch (StaleElementReferenceException ex){
                    if(Buttons.get(i).getText().equalsIgnoreCase("Accept")){
                        String s = Buttons.get(i).getAttribute("aria-label");
                        if(s != null && s.length()>6){
                            if(s.substring(0,6).equalsIgnoreCase("Accept")){
                                Buttons.get(i).click();
                                Thread.sleep(2000);
                                System.out.println("Request Accepted");
                                Buttons.remove(i);
                                Buttons.clear();
                                driver.navigate().refresh();
                                Thread.sleep(2000);
                                Buttons = driver.findElements(By.tagName("button"));
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Browser has been opened");

    }
}
