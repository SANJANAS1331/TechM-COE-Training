import React, { useState, useEffect } from "react";
import axios from "axios";
import JobCard from "./JobCard";
import "bootstrap/dist/css/bootstrap.min.css";

const Jobs = () => {
  const [jobs, setJobs] = useState([]);
  const [selectedJob, setSelectedJob] = useState(null);

  useEffect(() => {
    axios
      .get("/jobs.json")
      .then((response) => {
        setJobs(response.data);
      })
      .catch((error) => {
        console.error("Error fetching jobs:", error);
      });
  }, []);

  return (
    <div className="container my-4">
      <h2 className="text-center mb-4">Available Jobs</h2>
      
      <div className="row row-cols-1 row-cols-md-3 g-4">
        {jobs.map((job) => (
          <div key={job.id} className="col">
            <div className="card shadow-sm p-3">
              <div className="card-body">
                <h5 className="card-title">{job.title}</h5>
                <p className="card-text"><strong>Company:</strong> {job.company}</p>
                <p className="card-text"><strong>Location:</strong> {job.location}</p>
                <p className="card-text"><strong>Skills:</strong> {job.skills.join(", ")}</p>
                <button className="btn btn-primary w-100" onClick={() => setSelectedJob(job)}>Apply</button>
              </div>
            </div>
          </div>
        ))}
      </div>

      {selectedJob && <JobCard job={selectedJob} onClose={() => setSelectedJob(null)} />}
    </div>
  );
};

export default Jobs;
