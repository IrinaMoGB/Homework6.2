package Homework6.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private final WebDriver driver;

    @FindBy(xpath = ".//a[text()='Войти']")
    private WebElement loginButtonHeader;
    @FindBy(xpath = "a[contains(@href, 'https://shop.tastycoffee.ru/coffee?methods=3a%2C4a')]")
    private WebElement linkTextCoffee;
    @FindBy(xpath = "//*[@id=\"catalog-products\"]/div[1]/div[4]/form/div[4]/div/a")
    private WebElement addButton;
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div[10]/div[1]/ul/li[4]/a")
    private WebElement linkTextChocolate;
    @FindBy(xpath = "(//a[@onclick='add_in_cart(this);return false;'])[2]")
    private WebElement  buyButton;
    @FindBy(xpath = "//a[contains(text(),'Перейти в корзину')]")
    private WebElement  linkTextCart;
    @FindBy(xpath = "//*[@id=\"city_popup\"]/form/div[2]/div/div[4]/a")
    private WebElement  citySTPetersburg;
    @FindBy(xpath = "//a[contains(text(),'Каналы')]")
    private WebElement  channelsButton;
    @FindBy(css = ".search-community__input\"")
    private WebElement searchInput;
    @FindBy(xpath = "//*[@id=\"openSearch_h\"]")
    private WebElement  loginButtonWindow;
    @FindBy(xpath = "//*[@id=\"search_h\"]")
    private WebElement  searchButton;
    @FindBy(xpath = "//a[contains(text(),'Кофе для бизнеса')")
    private WebElement  linkTextBusinessCoffee;
    @FindBy(xpath = "//div[@id='get-prices']")
    private WebElement  linkTextGetPrices;
    @FindBy(xpath = "//a[contains(text(),'О компании')]")
    private WebElement  linkTextAboutCompany;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginButtonHeader() {
        return loginButtonHeader;
    }

    public WebElement getlinkTextCoffee() {
        return linkTextCoffee;
    }
    public WebElement getaddButton() {
        return addButton;
    }
    public WebElement getlinkTextChocolate() {
        return linkTextChocolate;
    }
    public WebElement getbuyButton() {
        return buyButton;
    }
    public WebElement getlinkTextCart() {
        return linkTextCart;
    }
    public WebElement getcitySTPetersburg() {
        return citySTPetersburg;
    }
    public WebElement getchannelsButton() {
        return channelsButton;
    }
    public WebElement getloginButtonWindow() {
        return loginButtonWindow;
    }
    public WebElement getsearchButton() {
        return searchButton;
    }
    public WebElement getlinkTextBusinessCoffee() {
        return linkTextBusinessCoffee;
    }
    public WebElement getlinkTextGetPrices() {
        return linkTextGetPrices;
    }
    public WebElement getlinkTextAboutCompany() {
        return linkTextAboutCompany;
    }
    public HomePage clickOnElement(WebElement webElement) {
        webElement.click();
        return this;
    }

    public HomePage moveToElement(WebElement webElement) {
        new Actions(driver).moveToElement(webElement).perform();
        return this;
    }

    public HomePage inputSearch(String text) {
        searchInput.clear();
        searchInput.sendKeys(text);
        return this;
    }








}
