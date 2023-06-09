package StepDefs;

import cucumber.api.java.en.And;
import pagesObjectModel.DownloadPage;

import static StepDefs.Hooks.driver;

public class DownloadStepdefs {

    DownloadPage downloadPage = new DownloadPage(driver);

    @And("Je me redirige vers le site {string}  de la page Downloads")
    public void jeMeRedirigeVersLeSiteDeLaPageDownloads(String lien) {

        driver.get(lien);
    }

    @And("Le logo est bien présent sur la page Downloads")
    public void leLogoEstBienPrésentSurLaPageDownloads() {
        downloadPage.verifierLaPresenceDuLogo();
    }

    @And("je clique sur le lien  {string}")
    public void jeCliqueSurLeLien(String arg0) {
        downloadPage.cliquequerSurDownloads();
    }
}

