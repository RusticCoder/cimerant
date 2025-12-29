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
-- Name: blood_pressure; Type: TABLE; Schema: public; Owner: HealthPoints
--

CREATE TABLE public.blood_pressure (
    id bigint NOT NULL,
    "timestamp" timestamp without time zone NOT NULL,
    systolic integer NOT NULL,
    diastolic integer NOT NULL,
    user_id bigint
);


ALTER TABLE public.blood_pressure OWNER TO "HealthPoints";

--
-- Name: databasechangelog; Type: TABLE; Schema: public; Owner: HealthPoints
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


ALTER TABLE public.databasechangelog OWNER TO "HealthPoints";

--
-- Name: databasechangeloglock; Type: TABLE; Schema: public; Owner: HealthPoints
--

CREATE TABLE public.databasechangeloglock (
    id integer NOT NULL,
    locked boolean NOT NULL,
    lockgranted timestamp without time zone,
    lockedby character varying(255)
);


ALTER TABLE public.databasechangeloglock OWNER TO "HealthPoints";

--
-- Name: jhi_authority; Type: TABLE; Schema: public; Owner: HealthPoints
--

CREATE TABLE public.jhi_authority (
    name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_authority OWNER TO "HealthPoints";

--
-- Name: jhi_user; Type: TABLE; Schema: public; Owner: HealthPoints
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


ALTER TABLE public.jhi_user OWNER TO "HealthPoints";

--
-- Name: jhi_user_authority; Type: TABLE; Schema: public; Owner: HealthPoints
--

CREATE TABLE public.jhi_user_authority (
    user_id bigint NOT NULL,
    authority_name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_user_authority OWNER TO "HealthPoints";

--
-- Name: points; Type: TABLE; Schema: public; Owner: HealthPoints
--

CREATE TABLE public.points (
    id bigint NOT NULL,
    date date NOT NULL,
    exercise integer,
    meals integer,
    alcohol integer,
    notes character varying(140),
    user_id bigint
);


ALTER TABLE public.points OWNER TO "HealthPoints";

--
-- Name: preferences; Type: TABLE; Schema: public; Owner: HealthPoints
--

CREATE TABLE public.preferences (
    id bigint NOT NULL,
    weekly_goal integer NOT NULL,
    weight_units character varying(255) NOT NULL,
    user_id bigint
);


ALTER TABLE public.preferences OWNER TO "HealthPoints";

--
-- Name: sequence_generator; Type: SEQUENCE; Schema: public; Owner: HealthPoints
--

CREATE SEQUENCE public.sequence_generator
    START WITH 1050
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.sequence_generator OWNER TO "HealthPoints";

--
-- Name: weight; Type: TABLE; Schema: public; Owner: HealthPoints
--

CREATE TABLE public.weight (
    id bigint NOT NULL,
    "timestamp" timestamp without time zone NOT NULL,
    weight double precision NOT NULL,
    user_id bigint
);


ALTER TABLE public.weight OWNER TO "HealthPoints";

--
-- Name: blood_pressure blood_pressure_pkey; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.blood_pressure
    ADD CONSTRAINT blood_pressure_pkey PRIMARY KEY (id);


--
-- Name: databasechangeloglock databasechangeloglock_pkey; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.databasechangeloglock
    ADD CONSTRAINT databasechangeloglock_pkey PRIMARY KEY (id);


--
-- Name: jhi_authority jhi_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.jhi_authority
    ADD CONSTRAINT jhi_authority_pkey PRIMARY KEY (name);


--
-- Name: jhi_user_authority jhi_user_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT jhi_user_authority_pkey PRIMARY KEY (user_id, authority_name);


--
-- Name: jhi_user jhi_user_pkey; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT jhi_user_pkey PRIMARY KEY (id);


--
-- Name: points points_pkey; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.points
    ADD CONSTRAINT points_pkey PRIMARY KEY (id);


--
-- Name: preferences preferences_pkey; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.preferences
    ADD CONSTRAINT preferences_pkey PRIMARY KEY (id);


--
-- Name: preferences ux_preferences__user_id; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.preferences
    ADD CONSTRAINT ux_preferences__user_id UNIQUE (user_id);


--
-- Name: jhi_user ux_user_email; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_email UNIQUE (email);


--
-- Name: jhi_user ux_user_login; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_login UNIQUE (login);


--
-- Name: weight weight_pkey; Type: CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.weight
    ADD CONSTRAINT weight_pkey PRIMARY KEY (id);


--
-- Name: jhi_user_authority fk_authority_name; Type: FK CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_authority_name FOREIGN KEY (authority_name) REFERENCES public.jhi_authority(name);


--
-- Name: blood_pressure fk_blood_pressure__user_id; Type: FK CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.blood_pressure
    ADD CONSTRAINT fk_blood_pressure__user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- Name: points fk_points__user_id; Type: FK CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.points
    ADD CONSTRAINT fk_points__user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- Name: preferences fk_preferences__user_id; Type: FK CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.preferences
    ADD CONSTRAINT fk_preferences__user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- Name: weight fk_weight__user_id; Type: FK CONSTRAINT; Schema: public; Owner: HealthPoints
--

ALTER TABLE ONLY public.weight
    ADD CONSTRAINT fk_weight__user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- PostgreSQL database dump complete
--

