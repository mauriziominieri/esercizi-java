package esercizio1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Curriculum {

    private final String name;

    private final List<Job> jobList;

    public Curriculum(String name) {
        this.name = name;
        jobList = new ArrayList<>();
    }

    public Job addJob(String description, int year) {
        Job job = new Job(description, year);
        jobList.add(job);
        return job;
    }

    class Job {

        private final String description;

        private final int year;

        private final int id;

        public Job(String description, int year) {
            this.description = description;
            this.year = year;
            this.id = jobList.size() + 1;
        }

        public Job next() {
            return this.id == jobList.size() ? null : jobList.get(id);
        }

        @Override
        public String toString() {
            return description + ": " + year;
        }
    }
}
