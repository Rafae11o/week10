package com.company.Builder.Builders;

import com.company.Builder.Cars.CarType;
import com.company.Builder.Components.Engine;
import com.company.Builder.Components.GPSNavigator;
import com.company.Builder.Components.Transmission;
import com.company.Builder.Components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
