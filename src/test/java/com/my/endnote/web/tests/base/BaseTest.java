package com.my.endnote.web.tests.base;

public class BaseTest {
  /*  private final static Logger LOG = Logger.getLogger(BaseTest.class.getName());
    public static final String PROPERTIES = "src/test/resources/properties/properties.properties";
    public static final String CHROME_DRIVER = "webdriver.chrome.driver";
    public WebDriver driver;
    private Properties property = new Properties();
    private String login;
    private String chromeDriver;
    private String mailHost;

    public String getMailHost() {
        return mailHost;
    }


    public String getLogin() {
        return login;
    }

    @Before
    public void setUp() {
        initProperties();
        setFields();
        System.setProperty(CHROME_DRIVER, chromeDriver);
        driver = DriverProvider.getDriver();
    }

    private void initProperties() {
        try (FileInputStream fis = new FileInputStream(PROPERTIES)) {
            property.load(fis);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void setFields() {
        chromeDriver = property.getProperty("chrome.driver");
        login = property.getProperty("login");
        mailHost = property.getProperty("mailHost");
    }

    @AfterClass
    public static void close() {
        ProviderCleaner.cleanUp();
    }*/


}
