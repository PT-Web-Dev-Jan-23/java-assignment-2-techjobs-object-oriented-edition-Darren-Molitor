package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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
        Assert.assertNotEquals(job1.getId(), job2.getId());
    }


}
