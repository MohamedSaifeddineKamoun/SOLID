package com.directi.training.dip.exercise;

/** Une Interface d'abstraction pour les modules d'encodage 
 * En cas où on avait besoin d'implémenter un autre module d'encodage avec une 
 * autre logique bas niv d'encodage mais avec la même entête haut niv.
 */
public interface IEncodingModule
{
    public void encodeWithFiles();
    public void encodeBasedOnNetworkAndDatabase(Database database);
}
