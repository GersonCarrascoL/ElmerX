package edu.stsm.dao;

import java.util.List;

import edu.stsm.entity.Pasajero;

public interface IPasajeroDAO {
	
	List<Pasajero> getAllPasajeros();
    Pasajero getPasajeroById(Integer idPasajero);
    Pasajero addPasajero(Pasajero pasajero);
    Pasajero updatePasajero(Pasajero pasajero);
    void deletePasajero(Integer idPasajero);

}
