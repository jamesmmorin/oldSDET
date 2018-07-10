package com.xpanxion.sdet;

import org.openqa.selenium.WebDriver;

public class XpanxionPageTemplate extends PgeObject{
    
    private Header header; 
    private Footer footer;
    
    public XpanxionPageTemplate (WebDriver driver){
            super(driver);
            this.header = new Header (driver);
            this.footer = new Footer (driver);
            
}
    
    public Header getHeader(){
        return this.header;
    }
    
    public Footer getFooter(){
        return this.footer;
    }
    

    
}
