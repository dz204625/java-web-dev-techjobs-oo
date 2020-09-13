package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId(){
        Job myFirstJob = new Job();
        Job mySecondJob = new Job();
        assertEquals(1, mySecondJob.getId() - myFirstJob.getId(), 0);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job myJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(myJob instanceof Job);
    }
    @Test
    public void testJobsForEquality(){
        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job myJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(myJob1.equals(myJob2));
    }

    @Test
    public void testToStringStartEndWithNewLine(){
        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( "\nid: 1\nname: Product tester\nemployer: ACME\nlocation: Desert\npositionType: Quality control\ncoreCompetency: Persistence\n" , myJob1.toString());
    }
    @Test
    public void testToStringEachFieldHasData(){
        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( "\nid: 1\nname: Product tester\nemployer: ACME\nlocation: Desert\npositionType: Quality control\ncoreCompetency: Persistence\n" , myJob1.toString());
    }

    @Test
    public void testToStringWithEmptyName(){
        Job myJob1 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( "\nid: 1\nname: Data not available\nemployer: ACME\nlocation: Desert\npositionType: Quality control\ncoreCompetency: Persistence\n" , myJob1.toString());
    }

    @Test
    public void testToStringWithEmptyEmployer(){
        Job myJob1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( "\nid: 1\nname: Product tester\nemployer: Data not available\nlocation: Desert\npositionType: Quality control\ncoreCompetency: Persistence\n" , myJob1.toString());
    }

    @Test
    public void testToStringWithEmptyLocation(){
        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( "\nid: 1\nname: Product tester\nemployer: ACME\nlocation: Data not available\npositionType: Quality control\ncoreCompetency: Persistence\n" , myJob1.toString());
    }

    @Test
    public void testToStringWithEmptyPositionType(){
        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals( "\nid: 1\nname: Product tester\nemployer: ACME\nlocation: Desert\npositionType: Data not available\ncoreCompetency: Persistence\n" , myJob1.toString());
    }

    @Test
    public void testToStringWithEmptyCoreCompetency(){
        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals( "\nid: 1\nname: Product tester\nemployer: ACME\nlocation: Desert\npositionType: Quality control\ncoreCompetency: Data not available\n" , myJob1.toString());
    }


}
