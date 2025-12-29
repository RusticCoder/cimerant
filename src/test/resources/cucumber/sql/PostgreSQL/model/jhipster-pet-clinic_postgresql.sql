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
-- Name: owners; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.owners (
    id bigint NOT NULL,
    firstname character varying(32) NOT NULL,
    lastname character varying(32) NOT NULL,
    address character varying(255) NOT NULL,
    city character varying(32),
    telephone character varying(20) NOT NULL
);


ALTER TABLE public.owners OWNER TO jhipster;

--
-- Name: pets; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.pets (
    id bigint NOT NULL,
    name character varying(32) NOT NULL,
    birthdate timestamp without time zone,
    type_id bigint,
    owner_id bigint
);


ALTER TABLE public.pets OWNER TO jhipster;

--
-- Name: rel_specialties__vet; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.rel_specialties__vet (
    vet_id bigint NOT NULL,
    specialties_id bigint NOT NULL
);


ALTER TABLE public.rel_specialties__vet OWNER TO jhipster;

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
-- Name: specialties; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.specialties (
    id bigint NOT NULL,
    name character varying(32) NOT NULL
);


ALTER TABLE public.specialties OWNER TO jhipster;

--
-- Name: types; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.types (
    id bigint NOT NULL,
    name character varying(80) NOT NULL
);


ALTER TABLE public.types OWNER TO jhipster;

--
-- Name: vets; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.vets (
    id bigint NOT NULL,
    firstname character varying(32) NOT NULL,
    lastname character varying(32) NOT NULL
);


ALTER TABLE public.vets OWNER TO jhipster;

--
-- Name: visits; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.visits (
    id bigint NOT NULL,
    visitdate timestamp without time zone NOT NULL,
    description character varying(255) NOT NULL,
    pet_id bigint
);


ALTER TABLE public.visits OWNER TO jhipster;

--
-- Name: databasechangeloglock databasechangeloglock_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.databasechangeloglock
    ADD CONSTRAINT databasechangeloglock_pkey PRIMARY KEY (id);


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
-- Name: owners owners_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.owners
    ADD CONSTRAINT owners_pkey PRIMARY KEY (id);


--
-- Name: pets pets_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.pets
    ADD CONSTRAINT pets_pkey PRIMARY KEY (id);


--
-- Name: rel_specialties__vet rel_specialties__vet_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.rel_specialties__vet
    ADD CONSTRAINT rel_specialties__vet_pkey PRIMARY KEY (specialties_id, vet_id);


--
-- Name: specialties specialties_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.specialties
    ADD CONSTRAINT specialties_pkey PRIMARY KEY (id);


--
-- Name: types types_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.types
    ADD CONSTRAINT types_pkey PRIMARY KEY (id);


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
-- Name: vets vets_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.vets
    ADD CONSTRAINT vets_pkey PRIMARY KEY (id);


--
-- Name: visits visits_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.visits
    ADD CONSTRAINT visits_pkey PRIMARY KEY (id);


--
-- Name: jhi_user_authority fk_authority_name; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_authority_name FOREIGN KEY (authority_name) REFERENCES public.jhi_authority(name);


--
-- Name: pets fk_pets__owner_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.pets
    ADD CONSTRAINT fk_pets__owner_id FOREIGN KEY (owner_id) REFERENCES public.owners(id);


--
-- Name: pets fk_pets__type_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.pets
    ADD CONSTRAINT fk_pets__type_id FOREIGN KEY (type_id) REFERENCES public.types(id);


--
-- Name: rel_specialties__vet fk_rel_specialties__vet__specialties_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.rel_specialties__vet
    ADD CONSTRAINT fk_rel_specialties__vet__specialties_id FOREIGN KEY (specialties_id) REFERENCES public.specialties(id);


--
-- Name: rel_specialties__vet fk_rel_specialties__vet__vet_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.rel_specialties__vet
    ADD CONSTRAINT fk_rel_specialties__vet__vet_id FOREIGN KEY (vet_id) REFERENCES public.vets(id);


--
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- Name: visits fk_visits__pet_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.visits
    ADD CONSTRAINT fk_visits__pet_id FOREIGN KEY (pet_id) REFERENCES public.pets(id);


--
-- PostgreSQL database dump complete
--

