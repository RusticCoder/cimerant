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
-- Name: career; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.career (
    id bigint NOT NULL,
    step integer NOT NULL,
    description character varying(64) NOT NULL,
    image_path character varying(128),
    synopsis character varying(512),
    profile_id bigint
);


ALTER TABLE public.career OWNER TO jhipster;

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
-- Name: interest; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.interest (
    id bigint NOT NULL,
    title character varying(64) NOT NULL,
    image_path character varying(128),
    description character varying(512),
    profile_id bigint
);


ALTER TABLE public.interest OWNER TO jhipster;

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
-- Name: profile; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.profile (
    id bigint NOT NULL,
    name character varying(64) NOT NULL,
    location character varying(64),
    status character varying(255) NOT NULL,
    avatar_path character varying(128),
    photo_path character varying(128),
    description character varying(512),
    email character varying(256) NOT NULL,
    github character varying(2048),
    linkedin character varying(2048),
    twitter character varying(2048),
    created_by bigint NOT NULL,
    created_dt timestamp without time zone NOT NULL,
    modified_by bigint,
    modified_dt timestamp without time zone
);


ALTER TABLE public.profile OWNER TO jhipster;

--
-- Name: project; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.project (
    id bigint NOT NULL,
    name character varying(64) NOT NULL,
    url character varying(2048) NOT NULL,
    profile_id bigint
);


ALTER TABLE public.project OWNER TO jhipster;

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
-- Name: skill; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.skill (
    id bigint NOT NULL,
    level character varying(255) NOT NULL,
    skill character varying(64),
    description character varying(512),
    profile_id bigint,
    skill_category_id bigint
);


ALTER TABLE public.skill OWNER TO jhipster;

--
-- Name: skill_category; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.skill_category (
    id bigint NOT NULL,
    category character varying(64) NOT NULL
);


ALTER TABLE public.skill_category OWNER TO jhipster;

--
-- Name: career career_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.career
    ADD CONSTRAINT career_pkey PRIMARY KEY (id);


--
-- Name: databasechangeloglock databasechangeloglock_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.databasechangeloglock
    ADD CONSTRAINT databasechangeloglock_pkey PRIMARY KEY (id);


--
-- Name: interest interest_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.interest
    ADD CONSTRAINT interest_pkey PRIMARY KEY (id);


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
-- Name: profile profile_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.profile
    ADD CONSTRAINT profile_pkey PRIMARY KEY (id);


--
-- Name: project project_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.project
    ADD CONSTRAINT project_pkey PRIMARY KEY (id);


--
-- Name: skill_category skill_category_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.skill_category
    ADD CONSTRAINT skill_category_pkey PRIMARY KEY (id);


--
-- Name: skill skill_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.skill
    ADD CONSTRAINT skill_pkey PRIMARY KEY (id);


--
-- Name: profile ux_profile__email; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.profile
    ADD CONSTRAINT ux_profile__email UNIQUE (email);


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
-- Name: career fk_career__profile_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.career
    ADD CONSTRAINT fk_career__profile_id FOREIGN KEY (profile_id) REFERENCES public.profile(id);


--
-- Name: interest fk_interest__profile_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.interest
    ADD CONSTRAINT fk_interest__profile_id FOREIGN KEY (profile_id) REFERENCES public.profile(id);


--
-- Name: project fk_project__profile_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.project
    ADD CONSTRAINT fk_project__profile_id FOREIGN KEY (profile_id) REFERENCES public.profile(id);


--
-- Name: skill fk_skill__profile_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.skill
    ADD CONSTRAINT fk_skill__profile_id FOREIGN KEY (profile_id) REFERENCES public.profile(id);


--
-- Name: skill fk_skill__skill_category_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.skill
    ADD CONSTRAINT fk_skill__skill_category_id FOREIGN KEY (skill_category_id) REFERENCES public.skill_category(id);


--
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- PostgreSQL database dump complete
--

