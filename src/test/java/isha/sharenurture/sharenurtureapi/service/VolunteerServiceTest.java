package isha.sharenurture.sharenurtureapi.service;

import isha.sharenurture.sharenurtureapi.model.Volunteer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import isha.sharenurture.sharenurtureapi.repository.VolunteerRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class VolunteerServiceTest {

    @Mock
    VolunteerRepository volunteerMockRepository;

    @InjectMocks
    VolunteerService volunteerService;

    @BeforeEach
    void init_mocks() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void givenVolunteerWithIdDoesNotExists_WhenGetVolunteerById_ThenThrowsNoSuchElementException() {
        Mockito.when(volunteerMockRepository.findById(Mockito.anyInt())).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> volunteerService.getVolunteer(1));
    }

    @Test
    public void givenVolunteerWithIdExists_WhenGetVolunteerById_ThenReturnsVolunteer() {
        Volunteer volunteer = new Volunteer(10, "viktor");

        Mockito.when(volunteerMockRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(volunteer));

        assertEquals(volunteerService.getVolunteer(10), volunteer);
    }
}