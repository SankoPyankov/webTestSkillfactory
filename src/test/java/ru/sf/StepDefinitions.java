package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class StepDefinitions {
    public static final WebDriver webDriver;
    public static final SFMainPage sfMainPage;
    public static final SFCoursesPage sfCoursesPage;
    public static final SFPythonPage sfPythonPage;
    public static final SFManagement sfManagementPage;
    public static final SFDataSciencePage sfDataSciencePage;
    public static final SFWebRazrabotkaPage sfWebRazrabotkaPage;
    public static final SFRazrabotkaPrilozheniyPage sfRazrabotkaPrilozheniyPage;
    public static final SFDesignPage sfDesignPage;
    public static final SFCareerCenterPage sfCareerCenterPage;
    public static final SFContactsPage sfContactsPage;
    public static final SFFreeEventsPage sfFreeEventsPage;
    public static final SFStudentsReviewsPage sfStudentsReviewsPage;
    public static final SFActionsPage sfActionPage;
    public static final SFReferralProgramPage sfReferralProgramPage;
    public static final SFPartnerProgramPage sfPartnerProgram;


    static {
        System.setProperty("webdriver.chrome.driver", "C:\\skillfactory\\Project_36.1.1-SkillFactory\\Project_36.1.1\\src\\test\\resources\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        sfMainPage = new SFMainPage(webDriver);
        sfCoursesPage = new SFCoursesPage(webDriver);
        sfPythonPage = new SFPythonPage(webDriver);
        sfManagementPage = new SFManagement(webDriver);
        sfDataSciencePage = new SFDataSciencePage(webDriver);
        sfWebRazrabotkaPage = new SFWebRazrabotkaPage(webDriver);
        sfRazrabotkaPrilozheniyPage = new SFRazrabotkaPrilozheniyPage(webDriver);
        sfDesignPage = new SFDesignPage(webDriver);
        sfCareerCenterPage = new SFCareerCenterPage(webDriver);
        sfContactsPage = new SFContactsPage(webDriver);
        sfFreeEventsPage = new SFFreeEventsPage(webDriver);
        sfStudentsReviewsPage = new SFStudentsReviewsPage(webDriver);
        sfActionPage = new SFActionsPage(webDriver);
        sfReferralProgramPage = new SFReferralProgramPage(webDriver);
        sfPartnerProgram = new SFPartnerProgramPage(webDriver);
    }

    //scenario1

    @Given("url of sf {string}")
    public void url_of_sf(String url) {
        sfMainPage.openPage(url);
    }
    @When("click button all courses")
    public void click_button_all_courses() {
        sfMainPage.clickButtonAllCourses();
    }
    @Then("verify that page courses is opened {string}")
    public void verify_that_page_courses_is_opened(String url) {
        sfCoursesPage.switchToNewTab();
        sfCoursesPage.actualPage(url);
    }

    //scenario2

    @When("chosen free-events")
    public void chosen_free_events() {
        sfMainPage.clickButtonFreeEvents();
    }
    @Then("verify that page free-events is opened {string}")
    public void verify_that_page_free_events_is_opened(String url) {
        sfFreeEventsPage.switchToNewTab();
        sfFreeEventsPage.actualPage(url);
    }

    @When("chosen career-center")
    public void chosen_career_center() {
        sfMainPage.clickButtonCareerCenter();
    }
    @Then("verify that page career-center is opened {string}")
    public void verify_that_page_career_center_is_opened(String url) {
        sfCareerCenterPage.switchToNewTab();
        sfCareerCenterPage.actualPage(url);

    }
    @When("chosen contacts")
    public void chosen_contacts() {
        sfMainPage.clickButtonContacts();
    }
    @Then("verify that page contacts is opened {string}")
    public void verify_that_page_contacts_is_opened(String url) {
        sfContactsPage.switchToNewTab();
        sfContactsPage.actualPage(url);
    }

    //scenario3

    @When("chosen block other")
    public void chosen_block_other() {
        sfContactsPage.switchToNewTab();
        sfContactsPage.clickBlockOther();
    }
    @Then("verify that user got form {string} in contact information")
    public void verify_that_user_got_form_in_contact_information(String formName) {
        sfContactsPage.actualForm(formName);
    }

    @When("clicked button start on test what profession without code suits you")
    public void clicked_button_start_on_test_what_profession_without_code_suits_you() {
        sfFreeEventsPage.switchToNewTab();
        sfFreeEventsPage.clickButtonStart();
    }
    @Then("assert that user got the first step of test {string}")
    public void assert_that_user_got_the_first_step_of_test(String testName) {
        sfFreeEventsPage.actualTest(testName);
    }

    //scenario4

    @Then("opened dropdown")
    public void opened_dropdown() {
        sfMainPage.clickButtonOnlineCourses();
    }
    @Then("chosen data-science in dropdown")
    public void chosen_data_science_in_dropdown() {
        sfMainPage.clickButtonDataScience();
    }
    @Then("verify that page data-science is opened {string}")
    public void verify_that_page_data_science_is_opened(String url) {
        sfDataSciencePage.switchToNewTab();
        sfDataSciencePage.actualPage(url);
    }

    @Then("chosen web-razrabotka in dropdown")
    public void chosen_web_razrabotka_in_dropdown() {
        sfMainPage.clickButtonWebRazrabotka();
    }
    @Then("verify that page web-razrabotka is opened {string}")
    public void verify_that_page_web_razrabotka_is_opened(String url) {
        sfWebRazrabotkaPage.switchToNewTab();
        sfWebRazrabotkaPage.actualPage(url);
    }

    @Then("chosen razrabotka-mobilnyh-prilozheniy in dropdown")
    public void chosen_razrabotka_mobilnyh_prilozheniy_in_dropdown() {
        sfMainPage.clickButtonRazrabotkaPrilozheniy();
    }
    @Then("verify that page razrabotka-mobilnyh-prilozheniy is opened {string}")
    public void verify_that_page_razrabotka_mobilnyh_prilozheniy_is_opened(String url) {
        sfRazrabotkaPrilozheniyPage.switchToNewTab();
        sfRazrabotkaPrilozheniyPage.actualPage(url);
    }

    @Then("chosen design in dropdown")
    public void chosen_design_in_dropdown() {
        sfMainPage.clickButtonDesign();
    }
    @Then("verify that page design is opened {string}")
    public void verify_that_page_design_is_opened(String url) {
        sfDesignPage.switchToNewTab();
        sfDesignPage.actualPage(url);
    }

    //scenario5

    @Given("url of sf page {string}")
    public void url_of_sf_page(String url) {
        sfCoursesPage.openPage(url);
    }
    @When("click on main button")
    public void click_on_main_button() {
        sfCoursesPage.clickButtonMain();
    }
    @Then("verify that main page is opened {string}")
    public void verify_that_main_page_is_opened(String url) {
        sfMainPage.actualPage(url);
    }

    //Scenario6

    @Given("url of sf page courses {string}")
    public void given_url_of_sf_page_courses(String url) {
        sfCoursesPage.openPage(url);
    }
    @Then("chosen programmirovanie")
    public void chosen_programmirovanie() {
        sfCoursesPage.clickButtonProgrammirovanie();
    }
    @Then("verify that page programmirovanie is opened {string}")
    public void verify_that_page_programmirovanie_is_opened(String url) {
        sfCoursesPage.actualPage(url);
    }

    @Then("chosen testirovanie")
    public void chosen_testirovanie() {
        sfCoursesPage.clickButtonTestirovanie();
    }
    @Then("verify that page testirovanie is opened {string}")
    public void verify_that_page_testirovanie_is_opened(String url) {
        sfCoursesPage.actualPage(url);
    }

    @Then("chosen analitika-dannyh")
    public void chosen_analitika_dannyh() {
        sfCoursesPage.clickButtonAnalitikaDannyh();
    }
    @Then("verify that page analitika-dannyh is opened {string}")
    public void verify_that_page_analitika_dannyh_is_opened(String url) {
        sfCoursesPage.actualPage(url);
    }

    @Then("chosen razrabotka-igr")
    public void chosen_razrabotka_igr() {
        sfCoursesPage.clickButtonRazrabotkaIgr();
    }
    @Then("verify that page razrabotka-igr is opened {string}")
    public void verify_that_page_razrabotka_igr_is_opened(String url) {
        sfCoursesPage.actualPage(url);
    }

    //scenario7

    @When("chosen Python")
    public void chosen_python() {
        sfCoursesPage.clickButtonPython();
    }
    @Then("chose Python-developer")
    public void chose_python_developer() {
        sfPythonPage.clickButtonPythonDeveloper();
    }
    @When("click button sign up for class")
    public void click_button_sign_up_for_class() {
        sfPythonPage.switchToNewTab();
        sfPythonPage.clickButtonSignUpForClass();
    }
    @When("click button leave a request in base rate")
    public void click_button_leave_a_request_in_base_rate() {
        sfPythonPage.clickButtonLeaveARequest();
    }
    @Then("assert that user got form {string} Python-developer")
    public void assert_that_user_got_form_Python_developer(String formName) {
        sfPythonPage.actualForm(formName);
    }

    @When("chosen management")
    public void chosen_management() {
        sfCoursesPage.clickButtonManagement();
    }
    @Then("chose product-manager")
    public void chose_product_manager() {
        sfManagementPage.clickBlockProductManager();
    }
    @Then("click button sign up for class profession product-manager")
    public void click_button_sign_up_for_class_profession_product_manager() {
        sfManagementPage.switchToNewTab();
        sfManagementPage.clickButtonSignUpForClass();
    }
    @Then("click button choose in optimal rate")
    public void click_button_choose_in_optimal_rate() {
        sfManagementPage.clickButtonChoose();
    }
    @Then("assert that user got form {string} product-manager")
    public void assert_that_user_got_form_product_manager(String formName) {
        sfManagementPage.actualForm(formName);
    }

    @When("chosen design")
    public void chosen_design() {
        sfCoursesPage.clickButtonDesign();
    }
    @Then("chose ux ui designer")
    public void chose_ux_ui_designer(){
        sfDesignPage.clickBlockUxUiDesigner();
    }
    @Then("click button sign up for class profession ux ui designer")
    public void click_button_sign_up_for_class_profession_ux_ui_designer() {
        sfDesignPage.switchToNewTab();
        sfDesignPage.clickButtonSignUpForClass();
    }
    @Then("assert that user got form {string} ux ui designer")
    public void assert_that_user_got_form_ux_ui_designer(String formName) {
        sfDesignPage.actualForm(formName);
    }

    //scenario8

    @When("chosen partner program")
    public void chosen_partner_program() {
        sfMainPage.clickButtonPartnerProgram();
    }
    @When("clicked button become a partner")
    public void clicked_button_become_a_partner() {
        sfPartnerProgram.switchToNewTab();
        sfPartnerProgram.clickButtonBecomeAPartner();
    }
    @Then("verify that page registration in partner program is opened {string}")
    public void verify_that_page_registration_in_partner_program_is_opened(String url) {
        sfPartnerProgram.actualPage(url);
    }

    @When("chosen referral program")
    public void chosen_referral_program() {
        sfMainPage.clickButtonReferralProgram();
    }
    @When("clicked button to participate in the program")
    public void clicked_button_to_participate_in_the_program() {
        sfReferralProgramPage.switchToNewTab();
        sfReferralProgramPage.clickButtonParticipateInProgram();
    }
    @Then("verify that page registration in referral program is opened {string}")
    public void verify_that_page_registration_in_referral_program_is_opened(String url) {
        sfReferralProgramPage.switchToNewTab();
        sfReferralProgramPage.actualPage(url);
    }

    //scenario9 (negative)

    @When("incorrect email entered {string}")
    public void incorrect_email_entered(String email) {
        sfMainPage.emailEntered(email);
    }
    @Then("verify that user got message {string}")
    public void verify_that_user_got_message(String message) {
        sfMainPage.errorMessage(message);
    }

    //scenario10

    @When("chosen page actions")
    public void chosen_page_actions() {
        sfMainPage.clickButtonActions();
    }
    @When("chosen student's reviews on page action")
    public void chosen_student_s_reviews_on_page_action() {
        sfActionPage.switchToNewTab();
        sfActionPage.clickButtonStudentsReview();
    }
    @Then("verify that page student's reviews is opened {string}")
    public void verify_that_page_student_s_reviews_is_opened(String url) {
        sfStudentsReviewsPage.actualPage(url);
    }

    //Bug
    @When("chosen student's reviews on main page")
    public void chosen_student_s_reviews_on_main_page() {
        sfMainPage.clickButtonStudentsReview();
    }
    @Then("verify that page student's reviews is opened right {string}")
    public void verify_that_page_student_s_reviews_is_opened_right(String url) {
        sfStudentsReviewsPage.switchToNewTab();
        sfStudentsReviewsPage.actualPage(url);
    }
}

