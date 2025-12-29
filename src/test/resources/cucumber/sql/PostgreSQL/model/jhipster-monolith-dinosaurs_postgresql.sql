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
-- Name: clade; Type: TABLE; Schema: public; Owner: dinosaurs
--

CREATE TABLE public.clade (
    id bigint NOT NULL,
    description character varying(64) NOT NULL
);


ALTER TABLE public.clade OWNER TO dinosaurs;

--
-- Name: databasechangelog; Type: TABLE; Schema: public; Owner: dinosaurs
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


ALTER TABLE public.databasechangelog OWNER TO dinosaurs;

--
-- Name: databasechangeloglock; Type: TABLE; Schema: public; Owner: dinosaurs
--

CREATE TABLE public.databasechangeloglock (
    id integer NOT NULL,
    locked boolean NOT NULL,
    lockgranted timestamp without time zone,
    lockedby character varying(255)
);


ALTER TABLE public.databasechangeloglock OWNER TO dinosaurs;

--
-- Name: dinosaur; Type: TABLE; Schema: public; Owner: dinosaurs
--

CREATE TABLE public.dinosaur (
    id bigint NOT NULL,
    name character varying(64) NOT NULL,
    weight integer,
    length integer,
    diet character varying(255),
    insert_dt timestamp without time zone NOT NULL,
    modified_dt timestamp without time zone NOT NULL,
    era_id bigint,
    clade_id bigint
);


ALTER TABLE public.dinosaur OWNER TO dinosaurs;

--
-- Name: era; Type: TABLE; Schema: public; Owner: dinosaurs
--

CREATE TABLE public.era (
    id bigint NOT NULL,
    name character varying(64) NOT NULL,
    from_ma integer,
    to_ma integer
);


ALTER TABLE public.era OWNER TO dinosaurs;

--
-- Name: jhi_authority; Type: TABLE; Schema: public; Owner: dinosaurs
--

CREATE TABLE public.jhi_authority (
    name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_authority OWNER TO dinosaurs;

--
-- Name: jhi_user; Type: TABLE; Schema: public; Owner: dinosaurs
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


ALTER TABLE public.jhi_user OWNER TO dinosaurs;

--
-- Name: jhi_user_authority; Type: TABLE; Schema: public; Owner: dinosaurs
--

CREATE TABLE public.jhi_user_authority (
    user_id bigint NOT NULL,
    authority_name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_user_authority OWNER TO dinosaurs;

--
-- Name: sequence_generator; Type: SEQUENCE; Schema: public; Owner: dinosaurs
--

CREATE SEQUENCE public.sequence_generator
    START WITH 1050
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.sequence_generator OWNER TO dinosaurs;

--
-- Name: clade clade_pkey; Type: CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.clade
    ADD CONSTRAINT clade_pkey PRIMARY KEY (id);


--
-- Name: databasechangeloglock databasechangeloglock_pkey; Type: CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.databasechangeloglock
    ADD CONSTRAINT databasechangeloglock_pkey PRIMARY KEY (id);


--
-- Name: dinosaur dinosaur_pkey; Type: CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.dinosaur
    ADD CONSTRAINT dinosaur_pkey PRIMARY KEY (id);


--
-- Name: era era_pkey; Type: CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.era
    ADD CONSTRAINT era_pkey PRIMARY KEY (id);


--
-- Name: jhi_authority jhi_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.jhi_authority
    ADD CONSTRAINT jhi_authority_pkey PRIMARY KEY (name);


--
-- Name: jhi_user_authority jhi_user_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT jhi_user_authority_pkey PRIMARY KEY (user_id, authority_name);


--
-- Name: jhi_user jhi_user_pkey; Type: CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT jhi_user_pkey PRIMARY KEY (id);


--
-- Name: jhi_user ux_user_email; Type: CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_email UNIQUE (email);


--
-- Name: jhi_user ux_user_login; Type: CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_login UNIQUE (login);


--
-- Name: jhi_user_authority fk_authority_name; Type: FK CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_authority_name FOREIGN KEY (authority_name) REFERENCES public.jhi_authority(name);


--
-- Name: dinosaur fk_dinosaur__clade_id; Type: FK CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.dinosaur
    ADD CONSTRAINT fk_dinosaur__clade_id FOREIGN KEY (clade_id) REFERENCES public.clade(id);


--
-- Name: dinosaur fk_dinosaur__era_id; Type: FK CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.dinosaur
    ADD CONSTRAINT fk_dinosaur__era_id FOREIGN KEY (era_id) REFERENCES public.era(id);


--
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: dinosaurs
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- PostgreSQL database dump complete
--

