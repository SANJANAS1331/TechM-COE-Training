import React, { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

const JobCard = ({ job, onClose }) => {
  const [formData, setFormData] = useState({ name: "", email: "", resume: "" });

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Application submitted for ${job.title} at ${job.company}!`);
    onClose(); 
  };

  return (
    <div className="position-fixed top-0 start-0 w-100 h-100 d-flex justify-content-center align-items-center bg-dark bg-opacity-50">
      <div className="bg-white p-4 rounded shadow-lg" style={{ width: "400px" }}>
        <h2 className="mb-3 text-center">Apply for {job.title}</h2>
        <p><strong>Company:</strong> {job.company}</p>
        <p><strong>Location:</strong> {job.location}</p>

        <form onSubmit={handleSubmit}>
          <div className="mb-3">
            <label className="form-label">Name</label>
            <input
              type="text"
              name="name"
              className="form-control"
              value={formData.name}
              onChange={handleChange}
              required
            />
          </div>

          <div className="mb-3">
            <label className="form-label">Email</label>
            <input
              type="email"
              name="email"
              className="form-control"
              value={formData.email}
              onChange={handleChange}
              required
            />
          </div>

          <div className="mb-3">
            <label className="form-label">Upload Resume</label>
            <input type="file" name="resume" className="form-control" required />
          </div>

          <button type="submit" className="btn btn-success w-100">Submit Application</button>
          <button type="button" className="btn btn-danger w-100 mt-2" onClick={onClose}>Cancel</button>
        </form>
      </div>
    </div>
  );
};

export default JobCard;
