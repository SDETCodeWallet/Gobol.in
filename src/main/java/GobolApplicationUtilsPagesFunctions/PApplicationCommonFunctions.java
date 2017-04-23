package GobolApplicationUtilsPagesFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumGenric.DriverFunctionUtils;

public class PApplicationCommonFunctions extends DriverFunctionUtils {

	class gobolFooterLinks {
		@FindBy(xpath = "//div[@class='n_footer-row']/div[1]/div[@class='n_footer-col n_border prtn']/ul/li[2]/a[text()='About Us']")
		private WebElement aboutUs;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[1]/div[@class='n_footer-col n_border prtn']/ul/li/a[text()='Contact Us']")
		private WebElement contactUs;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[1]/div[@class='n_footer-col n_border prtn']/ul/li/a[text()='Affiliate Programme']")
		private WebElement affiliateProgramme;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[1]/div[@class='n_footer-col n_border prtn']/ul/li/a[text()='Product Categories']")
		private WebElement productCategories;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[1]/div[@class='n_footer-col n_border prtn']/ul/li/a[text()='All Brands']")
		private WebElement allBrands;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[1]/div[@class='n_footer-col n_border prtn']/ul/li/a[text()='Blog']")
		private WebElement blog;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[1]/div[@class='n_footer-col n_border prtn']/ul/li/a[text()='Sitemap']")
		private WebElement siteMap;

		public PGobolAboutUs fn_AboutUs() {
			clickOnWebelement(aboutUs);
			PGobolAboutUs navigateToAboutUs = PageFactory.initElements(driver, PGobolAboutUs.class);
			return navigateToAboutUs;
		}

		public PGobolContactUs fn_ContactUs() {
			clickOnWebelement(contactUs);
			PGobolContactUs navigateToContactUs = PageFactory.initElements(driver, PGobolContactUs.class);
			return navigateToContactUs;
		}

		public PGobolAffiliateProg fn_AffiliateProgramme() {
			clickOnWebelement(affiliateProgramme);
			PGobolAffiliateProg navigateToAffiliateProgramme = PageFactory.initElements(driver,
					PGobolAffiliateProg.class);
			return navigateToAffiliateProgramme;
		}

		public PGobolProductCategories fn_ProductCategories() {
			clickOnWebelement(productCategories);
			PGobolProductCategories navigateToProductCategories = PageFactory.initElements(driver,
					PGobolProductCategories.class);
			return navigateToProductCategories;
		}

		public PGobolAllBrands fn_AllBrands() {
			clickOnWebelement(allBrands);
			PGobolAllBrands navigateToAllBrands = PageFactory.initElements(driver, PGobolAllBrands.class);
			return navigateToAllBrands;
		}

		public PGobolBlog fn_Blog() {
			clickOnWebelement(blog);
			PGobolBlog navigateToBlog = PageFactory.initElements(driver, PGobolBlog.class);
			return navigateToBlog;
		}

		public PGobolSiteMap fn_SiteMap() {
			clickOnWebelement(siteMap);
			PGobolSiteMap navigateToSiteMap = PageFactory.initElements(driver, PGobolSiteMap.class);
			return navigateToSiteMap;
		}
	}

	class helpFooterLinks {
		@FindBy(xpath = "//div[@class='n_footer-row']/div[@class='n_footer_left']/div[@class='n_footer-col n_padding n_border prtn']/ul/li/a[text()='Payment']")
		private WebElement payment;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[@class='n_footer_left']/div[@class='n_footer-col n_padding n_border prtn']/ul/li/a[text()='Warranty']")
		private WebElement warranty;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[@class='n_footer_left']/div[@class='n_footer-col n_padding n_border prtn']/ul/li/a[text()='Shipping']")
		private WebElement shipping;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[@class='n_footer_left']/div[@class='n_footer-col n_padding n_border prtn']/ul/li/a[text()='Returns & Replacement']")
		private WebElement returnsReplacement;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[@class='n_footer_left']/div[@class='n_footer-col n_padding n_border prtn']/ul/li/a[text()='FAQs']")
		private WebElement fAQs;
		@FindBy(xpath = "//div[@class='n_footer-row']/div[@class='n_footer_left']/div[@class='n_footer-col n_padding n_border prtn']/ul/li/a[text()='Track Your Order']")
		private WebElement trackYourOrder;

		public PHelpPayment fn_Payment() {
			clickOnWebelement(payment);
			PHelpPayment navigateToPayment = PageFactory.initElements(driver, PHelpPayment.class);
			return navigateToPayment;
		}

		public PHelpWarranty fn_Warranty() {
			clickOnWebelement(warranty);
			PHelpWarranty navigateToWarranty = PageFactory.initElements(driver, PHelpWarranty.class);
			return navigateToWarranty;
		}

		public PHelpShipping fn_shipping() {
			clickOnWebelement(shipping);
			PHelpShipping navigateToShipping = PageFactory.initElements(driver, PHelpShipping.class);
			return navigateToShipping;
		}

		public PHelpReturnReplacement fn_ReturnReplacment() {
			clickOnWebelement(returnsReplacement);
			PHelpReturnReplacement navigateToReturnReplacement = PageFactory.initElements(driver,
					PHelpReturnReplacement.class);
			return navigateToReturnReplacement;
		}

		public PHelpFaqs fn_Faqs() {
			clickOnWebelement(fAQs);
			PHelpFaqs navigateToFaqs = PageFactory.initElements(driver, PHelpFaqs.class);
			return navigateToFaqs;
		}

		public PHelpTrackYourOrder fn_TrackOrder() {
			clickOnWebelement(trackYourOrder);
			PHelpTrackYourOrder navigateToTrackOrder = PageFactory.initElements(driver, PHelpTrackYourOrder.class);
			return navigateToTrackOrder;
		}
	}

	class newsLetterConnectWithUs {

		@FindBy(css = "input#newsletter[class='news-latter-input']")
		private WebElement newsLetter;
		@FindBy(xpath = "//div[@class='n_newslatter n_border-bottom']/button[@type='submit']")
		private WebElement newsLetterSubmitButton;
		@FindBy(xpath = "//div[@class='n_footer-col n_padding n_border']/div[@class='n_downloadapp']/div[@class='n_downloadapp-img']")
		private WebElement downloadAndroidApp;
		@FindBy(xpath = "//div[@class='social-icons n_border-bottom']/div[@class='connect_fixed']/div/a[@href='https://www.facebook.com/Gobol.in']")
		private WebElement faceBookConnectWithUs;
		@FindBy(xpath = "//div[@class='social-icons n_border-bottom']/div[@class='connect_fixed']/div/a[@href='https://twitter.com/_gobol']")
		private WebElement twitterConnectWithUs;
		@FindBy(xpath = "//div[@class='social-icons n_border-bottom']/div[@class='connect_fixed']/div/a[@href=' https://www.linkedin.com/company/gobol']")
		private WebElement linkedinConnectWithUs;
		@FindBy(xpath = "//div[@class='social-icons n_border-bottom']/div[@class='connect_fixed']/div/a[@href='https://plus.google.com/+GobolIn/']")
		private WebElement googleConnectWithUs;
		@FindBy(xpath = "//div[@class='social-icons n_border-bottom']/div[@class='connect_fixed']/div/a[@href='#']")
		private WebElement youTubeConnectWithUs;

		public void fn_NewsLetter(String userinput) {
			inputValue(newsLetter, userinput);
		}

		public void fn_NewLetterSubmitButton() {
			clickOnWebelement(newsLetterSubmitButton);
		}

		public void fn_DownloadApplication() {
			clickOnWebelement(downloadAndroidApp);
		}

		public void fn_FaceBookConnectUs() {
			clickOnWebelement(faceBookConnectWithUs);
		}

		public void fn_TwitterCoonetUs() {
			clickOnWebelement(twitterConnectWithUs);
		}

		public void fn_LinkedinConnectUs() {
			clickOnWebelement(linkedinConnectWithUs);
		}

		public void fn_GoogleConnectUs() {
			clickOnWebelement(googleConnectWithUs);
		}

		public void fn_YouTubeConnectUs() {
			clickOnWebelement(youTubeConnectWithUs);
		}
	}

	class buyingGuides {
		@FindBy(xpath = "//div/a[text()='Are New Electronics Always the Best Option']")
		private WebElement alwaysTheBestOption;

		@FindBy(xpath = "//div/a[text()='smartphone buying guide']")
		private WebElement smartBuyingGuide;

		public void fn_BestOptionGuideOption() {
			clickOnWebelement(alwaysTheBestOption);
		}

		public void fn_SmartBuyingGuideOption() {
			clickOnWebelement(smartBuyingGuide);
		}
	}

	class mostSearches {

		class MobilesSections {
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Apple Mobiles']")
			private WebElement appleMobiles;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Nokia Mobiles']")
			private WebElement nokiaMobiles;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Samsung Mobiles']")
			private WebElement samsungMobiles;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Motorola Mobiles']")
			private WebElement motorolaMobiles;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='HTC Mobiles']")
			private WebElement htcMobiles;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='LG Mobiles']")
			private WebElement lgMobiles;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Sony Mobiles']")
			private WebElement sonyMobiles;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Micromax Mobiles']")
			private WebElement micromaxMobiles;
			@FindBy(xpath = "//div[@class='n_footer-row_3 border-dotted-bottom'][3]/div[2]/a[text()='VIEW ALL']")
			private WebElement viewAllBtn;

			public void fn_AppleMobile() {
				clickOnWebelement(appleMobiles);
			}

			public void fn_nokiaMobiles() {
				clickOnWebelement(nokiaMobiles);
			}

			public void fn_SamsungMobiles() {
				clickOnWebelement(samsungMobiles);
			}

			public void fn_motorolaMobiles() {
				clickOnWebelement(motorolaMobiles);
			}

			public void fn_htcMobiles() {
				clickOnWebelement(htcMobiles);
			}

			public void fn_lgMobiles() {
				clickOnWebelement(lgMobiles);
			}

			public void fn_sonyMobiles() {
				clickOnWebelement(sonyMobiles);
			}

			public void fn_micromaxMobiles() {
				clickOnWebelement(sonyMobiles);
			}

			public void fn_MobileViewAll() {
				clickOnWebelement(viewAllBtn);
			}
		}

		class TabletsSections {

			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Apple iPads']")
			private WebElement appleIpads;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Samsung']")
			private WebElement samsung;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Xiaomi | ']")
			private WebElement xiaomi;
			@FindBy(xpath = "//div[@class='most-searches-iteam'][2]/a[text()='VIEW ALL']")
			private WebElement viewAllBtn;

			public void fn_AppleIpads() {
				clickOnWebelement(appleIpads);
			}

			public void fn_SamsungIpads() {
				clickOnWebelement(samsung);
			}

			public void fn_XiaomiIpads() {
				clickOnWebelement(xiaomi);
			}

			public void fn_TabletsViewAll() {
				clickOnWebelement(viewAllBtn);
			}

		}

		class LaptopSections {
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Dell']")
			private WebElement dell;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Apple Macbook']")
			private WebElement apple;
			@FindBy(xpath = "//div[@class='most-searches-iteam']//a[text()='Acer']")
			private WebElement acer;
			@FindBy(xpath = "//div[@class='most-searches-iteam'][3]//a[text()='VIEW ALL']")
			private WebElement viewAllBtn;

			public void fn_DellLaptops() {
				clickOnWebelement(dell);
			}

			public void fn_AppleLaptops() {
				clickOnWebelement(apple);
			}

			public void fn_AcerLaptops() {
				clickOnWebelement(acer);
			}

			public void fn_LaptopsViewAll() {
				clickOnWebelement(viewAllBtn);
			}
		}

		class ProductCategoriesSections {
			@FindBy(xpath = "//div[@class='most-searches-iteam'][4]/a[text()='Super Buy']")
			private WebElement superBuy;
			@FindBy(xpath = "//div[@class='most-searches-iteam'][4]/a[text()='Surplus']")
			private WebElement surplus;
			@FindBy(xpath = "//div[@class='most-searches-iteam'][4]/a[text()='Carton Damaged']")
			private WebElement cartonDamaged;
			@FindBy(xpath = "//div[@class='most-searches-iteam'][4]/a[text()='Factory Seconds']")
			private WebElement FactorySeconds;
			@FindBy(xpath = "//div[@class='most-searches-iteam'][4]/a[text()='Refurbished']")
			private WebElement refurbished;
			@FindBy(xpath = "//div[@class='most-searches-iteam'][4]/a[text()='Pre-owned']")
			private WebElement Preowned;

			public void fn_SuperBuyCategory() {
				clickOnWebelement(superBuy);
			}

			public void fn_SurplusCategory() {
				clickOnWebelement(superBuy);
			}

			public void fn_CartonDamagedCategory() {
				clickOnWebelement(cartonDamaged);
			}

			public void fn_FactorySecondsCategory() {
				clickOnWebelement(FactorySeconds);
			}

			public void fn_refurbishedCategory() {
				clickOnWebelement(refurbished);
			}

			public void fn_PreownedCategory() {
				clickOnWebelement(Preowned);
			}

		}

	}

	class termsConditionsPrivacyPolicy {
		@FindBy(xpath = "//div[@class='n_footer-row_3']/div//a[text()='Terms & Conditions ']")
		private WebElement termsConditions;
		@FindBy(xpath = "//div[@class='n_footer-row_3']/div//a[text()=' Privacy Policy']")
		private WebElement privacyPolicy;

		public PTermsAndConditions fn_TermsConditons() {
			clickOnWebelement(termsConditions);
			PTermsAndConditions navigateToTermsAndConditions = PageFactory.initElements(driver,
					PTermsAndConditions.class);
			return navigateToTermsAndConditions;
		}

		public PPrivacyPolicy fn_PrivacyPolicy() {
			clickOnWebelement(privacyPolicy);
			PPrivacyPolicy navigateToPrivacyPolicy=PageFactory.initElements(driver, PPrivacyPolicy.class);
			return navigateToPrivacyPolicy;

		}
	}
}
