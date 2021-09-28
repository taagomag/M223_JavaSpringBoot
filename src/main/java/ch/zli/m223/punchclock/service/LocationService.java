package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Location;
import ch.zli.m223.punchclock.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    private LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location createLocation(Location location) {
        return locationRepository.saveAndFlush(location);
    }

    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    public void deleteLocation(Long id) {
        locationRepository.deleteById(id);
    }
}
