package com.flight.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEST")
public class flight {

        @Id
        @GeneratedValue
        private Long id;

        @Column(name="ID")
        private String flightId;

        @Column(name="NAME")
        private String name;

        //Setters and getters
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFlightId() {
                return flightId;
        }

        public void setFlightId(String flightId) {
                this.flightId = flightId;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override
        public String toString() {
            return "EmployeeEntity [id=" + id + ", firstName=" + name +
                     "]";
        }
    }

