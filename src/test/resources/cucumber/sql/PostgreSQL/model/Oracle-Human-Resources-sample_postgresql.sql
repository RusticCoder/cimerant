--
-- PostgreSQL database dump
--

-- Dumped from database version 17.4 (Debian 17.4-1.pgdg120+2)
-- Dumped by pg_dump version 17.4 (Debian 17.4-1.pgdg120+2)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: country; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.country (
    id bigint NOT NULL,
    country_name character varying(255),
    region_id bigint
);


ALTER TABLE public.country OWNER TO jhipster;

--
-- Name: databasechangelog; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.databasechangelog (
    id character varying(255) NOT NULL,
    author character varying(255) NOT NULL,
    filename character varying(255) NOT NULL,
    dateexecuted timestamp without time zone NOT NULL,
    orderexecuted integer NOT NULL,
    exectype character varying(10) NOT NULL,
    md5sum character varying(35),
    description character varying(255),
    comments character varying(255),
    tag character varying(255),
    liquibase character varying(20),
    contexts character varying(255),
    labels character varying(255),
    deployment_id character varying(10)
);


ALTER TABLE public.databasechangelog OWNER TO jhipster;

--
-- Name: databasechangeloglock; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.databasechangeloglock (
    id integer NOT NULL,
    locked boolean NOT NULL,
    lockgranted timestamp without time zone,
    lockedby character varying(255)
);


ALTER TABLE public.databasechangeloglock OWNER TO jhipster;

--
-- Name: department; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.department (
    id bigint NOT NULL,
    department_name character varying(255) NOT NULL,
    location_id bigint
);


ALTER TABLE public.department OWNER TO jhipster;

--
-- Name: employee; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.employee (
    id bigint NOT NULL,
    first_name character varying(255),
    last_name character varying(255),
    email character varying(255),
    phone_number character varying(255),
    hire_date timestamp without time zone,
    salary bigint,
    commission_pct bigint,
    manager_id bigint,
    department_id bigint
);


ALTER TABLE public.employee OWNER TO jhipster;

--
-- Name: TABLE employee; Type: COMMENT; Schema: public; Owner: jhipster
--

COMMENT ON TABLE public.employee IS 'The Employee entity.';


--
-- Name: COLUMN employee.first_name; Type: COMMENT; Schema: public; Owner: jhipster
--

COMMENT ON COLUMN public.employee.first_name IS 'The firstname attribute.';


--
-- Name: jhi_authority; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.jhi_authority (
    name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_authority OWNER TO jhipster;

--
-- Name: jhi_user; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.jhi_user (
    id bigint NOT NULL,
    login character varying(50) NOT NULL,
    password_hash character varying(60) NOT NULL,
    first_name character varying(50),
    last_name character varying(50),
    email character varying(191),
    image_url character varying(256),
    activated boolean NOT NULL,
    lang_key character varying(10),
    activation_key character varying(20),
    reset_key character varying(20),
    created_by character varying(50) NOT NULL,
    created_date timestamp without time zone,
    reset_date timestamp without time zone,
    last_modified_by character varying(50),
    last_modified_date timestamp without time zone
);


ALTER TABLE public.jhi_user OWNER TO jhipster;

--
-- Name: jhi_user_authority; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.jhi_user_authority (
    user_id bigint NOT NULL,
    authority_name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_user_authority OWNER TO jhipster;

--
-- Name: job; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.job (
    id bigint NOT NULL,
    job_title character varying(255),
    min_salary bigint,
    max_salary bigint,
    employee_id bigint
);


ALTER TABLE public.job OWNER TO jhipster;

--
-- Name: job_history; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.job_history (
    id bigint NOT NULL,
    start_date timestamp without time zone,
    end_date timestamp without time zone,
    language character varying(255),
    job_id bigint,
    department_id bigint,
    employee_id bigint
);


ALTER TABLE public.job_history OWNER TO jhipster;

--
-- Name: location; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.location (
    id bigint NOT NULL,
    street_address character varying(255),
    postal_code character varying(255),
    city character varying(255),
    state_province character varying(255),
    country_id bigint
);


ALTER TABLE public.location OWNER TO jhipster;

--
-- Name: TABLE location; Type: COMMENT; Schema: public; Owner: jhipster
--

COMMENT ON TABLE public.location IS 'not an ignored comment';


--
-- Name: region; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.region (
    id bigint NOT NULL,
    region_name character varying(255)
);


ALTER TABLE public.region OWNER TO jhipster;

--
-- Name: rel_job__task; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.rel_job__task (
    task_id bigint NOT NULL,
    job_id bigint NOT NULL
);


ALTER TABLE public.rel_job__task OWNER TO jhipster;

--
-- Name: sequence_generator; Type: SEQUENCE; Schema: public; Owner: jhipster
--

CREATE SEQUENCE public.sequence_generator
    START WITH 1050
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.sequence_generator OWNER TO jhipster;

--
-- Name: task; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.task (
    id bigint NOT NULL,
    title character varying(255),
    description character varying(255)
);


ALTER TABLE public.task OWNER TO jhipster;

--
-- Name: TABLE task; Type: COMMENT; Schema: public; Owner: jhipster
--

COMMENT ON TABLE public.task IS 'Task entity.\n@author The JHipster team.';


--
-- Name: country country_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.country
    ADD CONSTRAINT country_pkey PRIMARY KEY (id);


--
-- Name: databasechangeloglock databasechangeloglock_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.databasechangeloglock
    ADD CONSTRAINT databasechangeloglock_pkey PRIMARY KEY (id);


--
-- Name: department department_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.department
    ADD CONSTRAINT department_pkey PRIMARY KEY (id);


--
-- Name: employee employee_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (id);


--
-- Name: jhi_authority jhi_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_authority
    ADD CONSTRAINT jhi_authority_pkey PRIMARY KEY (name);


--
-- Name: jhi_user_authority jhi_user_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT jhi_user_authority_pkey PRIMARY KEY (user_id, authority_name);


--
-- Name: jhi_user jhi_user_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT jhi_user_pkey PRIMARY KEY (id);


--
-- Name: job_history job_history_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.job_history
    ADD CONSTRAINT job_history_pkey PRIMARY KEY (id);


--
-- Name: job job_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.job
    ADD CONSTRAINT job_pkey PRIMARY KEY (id);


--
-- Name: location location_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.location
    ADD CONSTRAINT location_pkey PRIMARY KEY (id);


--
-- Name: region region_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.region
    ADD CONSTRAINT region_pkey PRIMARY KEY (id);


--
-- Name: rel_job__task rel_job__task_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.rel_job__task
    ADD CONSTRAINT rel_job__task_pkey PRIMARY KEY (job_id, task_id);


--
-- Name: task task_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.task
    ADD CONSTRAINT task_pkey PRIMARY KEY (id);


--
-- Name: country ux_country__region_id; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.country
    ADD CONSTRAINT ux_country__region_id UNIQUE (region_id);


--
-- Name: department ux_department__location_id; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.department
    ADD CONSTRAINT ux_department__location_id UNIQUE (location_id);


--
-- Name: job_history ux_job_history__department_id; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.job_history
    ADD CONSTRAINT ux_job_history__department_id UNIQUE (department_id);


--
-- Name: job_history ux_job_history__employee_id; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.job_history
    ADD CONSTRAINT ux_job_history__employee_id UNIQUE (employee_id);


--
-- Name: job_history ux_job_history__job_id; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.job_history
    ADD CONSTRAINT ux_job_history__job_id UNIQUE (job_id);


--
-- Name: location ux_location__country_id; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.location
    ADD CONSTRAINT ux_location__country_id UNIQUE (country_id);


--
-- Name: jhi_user ux_user_email; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_email UNIQUE (email);


--
-- Name: jhi_user ux_user_login; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_login UNIQUE (login);


--
-- Name: jhi_user_authority fk_authority_name; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_authority_name FOREIGN KEY (authority_name) REFERENCES public.jhi_authority(name);


--
-- Name: country fk_country__region_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.country
    ADD CONSTRAINT fk_country__region_id FOREIGN KEY (region_id) REFERENCES public.region(id);


--
-- Name: department fk_department__location_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.department
    ADD CONSTRAINT fk_department__location_id FOREIGN KEY (location_id) REFERENCES public.location(id);


--
-- Name: employee fk_employee__department_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT fk_employee__department_id FOREIGN KEY (department_id) REFERENCES public.department(id);


--
-- Name: employee fk_employee__manager_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT fk_employee__manager_id FOREIGN KEY (manager_id) REFERENCES public.employee(id);


--
-- Name: job fk_job__employee_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.job
    ADD CONSTRAINT fk_job__employee_id FOREIGN KEY (employee_id) REFERENCES public.employee(id);


--
-- Name: job_history fk_job_history__department_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.job_history
    ADD CONSTRAINT fk_job_history__department_id FOREIGN KEY (department_id) REFERENCES public.department(id);


--
-- Name: job_history fk_job_history__employee_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.job_history
    ADD CONSTRAINT fk_job_history__employee_id FOREIGN KEY (employee_id) REFERENCES public.employee(id);


--
-- Name: job_history fk_job_history__job_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.job_history
    ADD CONSTRAINT fk_job_history__job_id FOREIGN KEY (job_id) REFERENCES public.job(id);


--
-- Name: location fk_location__country_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.location
    ADD CONSTRAINT fk_location__country_id FOREIGN KEY (country_id) REFERENCES public.country(id);


--
-- Name: rel_job__task fk_rel_job__task__job_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.rel_job__task
    ADD CONSTRAINT fk_rel_job__task__job_id FOREIGN KEY (job_id) REFERENCES public.job(id);


--
-- Name: rel_job__task fk_rel_job__task__task_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.rel_job__task
    ADD CONSTRAINT fk_rel_job__task__task_id FOREIGN KEY (task_id) REFERENCES public.task(id);


--
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- PostgreSQL database dump complete
--

