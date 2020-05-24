package api.googleTranslate;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.*;
import com.google.common.collect.Lists;

public class GoogleTranslate {


    public void googleTranslate(){

        String credentialPath = "D:/PROJECT/TRANSLATE/GOOGLE CLOUD PLATEFORM ACCOUNT/flashcard-b52ebc8df412.json";

        // You can specify a credential file by providing a path to GoogleCredentials.
        // Otherwise credentials are read from the GOOGLE_APPLICATION_CREDENTIALS environment variable.
        GoogleCredentials credentials = null;

        try {
            credentials = GoogleCredentials.fromStream(new FileInputStream(credentialPath))
                    .createScoped(Lists.newArrayList("https://www.googleapis.com/auth/cloud-platform"));

            Translate translate = TranslateOptions.newBuilder().setCredentials(credentials).build().getService();

            Translation translation = translate.translate("¡Hola Mundo!");
            System.out.printf("Translated Text:\n\t%s\n", translation.getTranslatedText());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
