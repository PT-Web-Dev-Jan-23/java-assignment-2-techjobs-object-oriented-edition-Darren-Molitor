package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        Assert.assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertTrue(job1 instanceof Job);
        Assert.assertTrue(job1.getEmployer() instanceof Employer);
        Assert.assertTrue(job1.getLocation() instanceof Location);
        Assert.assertTrue(job1.getPositionType() instanceof PositionType);
        Assert.assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);

        Assert.assertEquals(job1.getName(), "Product tester");
        Assert.assertEquals(job1.getEmployer().getValue(), "ACME");
        Assert.assertEquals(job1.getLocation().getValue(), "Desert");
        Assert.assertEquals(job1.getPositionType().getValue(), "Quality control");
        Assert.assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertNotEquals(job1.getId(), job2.getId());    // This should return True which means it is false
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Assert.assertEquals(toString().charAt(0), '\n');
        Assert.assertEquals(toString().charAt(1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

    }

    @Test
    public String toString(Job jobId) {
        String returnValue = "\n" +
                "ID:  " + jobId.getId() + "\n" +
                "Name: " + jobId.getName() + "\n" +
                "Employer: " + jobId.getEmployer() + "\n" +
                "Location: " + jobId.getLocation() + "\n" +
                "Position Type: " + jobId.getPositionType() + "\n" +
                "Core Competency: " + jobId.getCoreCompetency() + "\n";
        return returnValue;
    }
}