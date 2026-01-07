package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        // Partie ' composition root ' où on instancie toutes les implémentations bas niv concrètes 
        IEncodingModule encodingModule = new EncodingModule();
        Database database = new MyDatabase();

        // Partie client (dependant des abstractions seulement)
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase(database);
    }
}
