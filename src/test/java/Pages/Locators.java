package Pages;
import StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Locators {

    //Teacher Scenario

    public WebElement select_teacher(){
        return Hooks.driver.findElement(By.id("uuid-b8a7176c-2394-446a-b411-a5a1c360cd47"));
    }
    public WebElement Enter_Teacher_name(){
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-content[1]/ng-component[1]/app-bg-linear-gradient-shapes-with-logo-layout[1]/app-bg-linear-gradient-layout[1]/div[1]/app-shape1[1]/div[1]/div[3]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/app-enter-your-name[1]/form[1]/input[1]"));
    }
    public WebElement Enter_next_to_pic(){
        return Hooks.driver.findElement(By.xpath("//span[contains(text(),'التالي')]"));
    }
    public WebElement select_picture(){
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-content[1]/ng-component[1]/app-bg-linear-gradient-shapes-with-logo-layout[1]/app-bg-linear-gradient-layout[1]/div[1]/app-shape1[1]/div[1]/div[3]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/app-select-avatar[1]/div[1]/div[1]/app-scrollbar[1]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/app-avatar-btn[1]/button[1]/span[1]/img[1]"));
    }
   public WebElement select_next(){
       return Hooks.driver.findElement(By.xpath("//span[contains(text(),'التالي')]"));
   }
   public WebElement add_subtract(){
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-content[1]/ng-component[1]/div[1]/div[1]/ng-component[1]/div[1]/app-competitions2[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/i[1]"));
   }
  public WebElement start_challenge(){
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'ابدأ')]"));
  }
  public WebElement create_new_challenge(){
        return Hooks.driver.findElement(By.xpath("//span[contains(text(),'إنشاء')]"));
  }
  public WebElement get_challenge_code(){
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-content[1]/ng-component[1]/div[1]/ng-component[1]/app-content-with-toolbars-layout[1]/div[1]/div[2]/app-card3[1]/div[1]/div[1]/div[1]/app-live-competition-lobby[1]/app-lobby-pin-code[1]/div[1]/div[3]/div[1]/div[1]"));
  }
  public WebElement get_challenge_link(){
        return Hooks.driver.findElement(By.xpath("//div[contains(text(),'https://comp.maknoon.com.sa/join/88125925')]"));
  }
  public WebElement start_challenge_after_student_enter_code(){
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-content[1]/ng-component[1]/div[1]/ng-component[1]/app-content-with-toolbars-layout[1]/div[1]/div[2]/app-card3[1]/div[1]/div[1]/div[1]/app-live-competition-lobby[1]/app-lobby-pin-code[1]/div[1]/div[2]/app-button2[1]/button[1]/span[1]"));
  }

  //student scenario

    public WebElement select_student(){
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-content[1]/ng-component[1]/app-bg-linear-gradient-shapes-with-logo-layout[1]/app-bg-linear-gradient-layout[1]/div[1]/app-shape1[1]/div[1]/div[3]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/app-select-user-type[1]/div[1]/div[1]/app-button3[1]/button[1]/span[1]/span[1]/span[1]"));
    }
    public WebElement Enter_Student_Name(){
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-content[1]/ng-component[1]/app-bg-linear-gradient-shapes-with-logo-layout[1]/app-bg-linear-gradient-layout[1]/div[1]/app-shape1[1]/div[1]/div[3]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/app-enter-your-name[1]/form[1]/input[1]"));
    }
    public WebElement select_next_student_name(){
        return Hooks.driver.findElement(By.xpath("//span[contains(text(),'التالي')]"));
    }
    public WebElement select_photo(){
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-content[1]/ng-component[1]/app-bg-linear-gradient-shapes-with-logo-layout[1]/app-bg-linear-gradient-layout[1]/div[1]/app-shape1[1]/div[1]/div[3]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/app-select-avatar[1]/div[1]/div[1]/app-scrollbar[1]/ng-scrollbar[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/app-avatar-btn[1]/button[1]/span[1]/img[1]"));
    }
    public WebElement student_select_next(){
        return Hooks.driver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-content[1]/ng-component[1]/app-bg-linear-gradient-shapes-with-logo-layout[1]/app-bg-linear-gradient-layout[1]/div[1]/app-shape1[1]/div[1]/div[3]/div[1]/div[2]/ng-component[1]/div[1]/div[1]/app-select-avatar[1]/div[1]/app-button2[1]/button[1]/span[1]"));
    }
    public WebElement enter_challenge_code(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(120));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ngmodel='input1']")));
    }
}
