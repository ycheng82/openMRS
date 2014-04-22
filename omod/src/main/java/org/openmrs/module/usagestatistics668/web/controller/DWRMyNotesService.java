package org.openmrs.module.usagestatistics668.web.controller;

import java.util.ArrayList;
import java.util.Collection;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.usagestatistics668.Note;
import org.openmrs.module.usagestatistics668.NoteService;

/**
 *
 * @author levine
 */
public class DWRMyNotesService {
    private Collection<Patient> patients;
    private Collection<Note> notes;
    
    public Collection<Note> getNotesForPatient(String patientName) {
        System.out.println("My DWR called - notes for: " + patientName);
        ArrayList<Note> nots = new ArrayList<Note>();
        ArrayList<String> texts = new ArrayList<String>();
        patients = Context.getPatientService().getAllPatients();
        NoteService noteService = Context.getService(NoteService.class);

        for (Patient p : patients) {
            nots.addAll(noteService.getNotesByPatient(p));
        }
        return nots;
    }
}
