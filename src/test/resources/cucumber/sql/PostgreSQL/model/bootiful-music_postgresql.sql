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
-- Name: album; Type: TABLE; Schema: public; Owner: bootifulmusic
--

CREATE TABLE public.album (
    id bigint NOT NULL,
    name character varying(255) NOT NULL,
    artist_id bigint,
    genre_id bigint
);


ALTER TABLE public.album OWNER TO bootifulmusic;

--
-- Name: artist; Type: TABLE; Schema: public; Owner: bootifulmusic
--

CREATE TABLE public.artist (
    id bigint NOT NULL,
    name character varying(255) NOT NULL
);


ALTER TABLE public.artist OWNER TO bootifulmusic;

--
-- Name: databasechangelog; Type: TABLE; Schema: public; Owner: bootifulmusic
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


ALTER TABLE public.databasechangelog OWNER TO bootifulmusic;

--
-- Name: databasechangeloglock; Type: TABLE; Schema: public; Owner: bootifulmusic
--

CREATE TABLE public.databasechangeloglock (
    id integer NOT NULL,
    locked boolean NOT NULL,
    lockgranted timestamp without time zone,
    lockedby character varying(255)
);


ALTER TABLE public.databasechangeloglock OWNER TO bootifulmusic;

--
-- Name: genre; Type: TABLE; Schema: public; Owner: bootifulmusic
--

CREATE TABLE public.genre (
    id bigint NOT NULL,
    name character varying(255) NOT NULL
);


ALTER TABLE public.genre OWNER TO bootifulmusic;

--
-- Name: jhi_authority; Type: TABLE; Schema: public; Owner: bootifulmusic
--

CREATE TABLE public.jhi_authority (
    name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_authority OWNER TO bootifulmusic;

--
-- Name: jhi_user; Type: TABLE; Schema: public; Owner: bootifulmusic
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


ALTER TABLE public.jhi_user OWNER TO bootifulmusic;

--
-- Name: jhi_user_authority; Type: TABLE; Schema: public; Owner: bootifulmusic
--

CREATE TABLE public.jhi_user_authority (
    user_id bigint NOT NULL,
    authority_name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_user_authority OWNER TO bootifulmusic;

--
-- Name: sequence_generator; Type: SEQUENCE; Schema: public; Owner: bootifulmusic
--

CREATE SEQUENCE public.sequence_generator
    START WITH 1050
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.sequence_generator OWNER TO bootifulmusic;

--
-- Name: track; Type: TABLE; Schema: public; Owner: bootifulmusic
--

CREATE TABLE public.track (
    id bigint NOT NULL,
    name character varying(255) NOT NULL,
    album_id bigint
);


ALTER TABLE public.track OWNER TO bootifulmusic;

--
-- Name: album album_pkey; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.album
    ADD CONSTRAINT album_pkey PRIMARY KEY (id);


--
-- Name: artist artist_pkey; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.artist
    ADD CONSTRAINT artist_pkey PRIMARY KEY (id);


--
-- Name: databasechangeloglock databasechangeloglock_pkey; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.databasechangeloglock
    ADD CONSTRAINT databasechangeloglock_pkey PRIMARY KEY (id);


--
-- Name: genre genre_pkey; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.genre
    ADD CONSTRAINT genre_pkey PRIMARY KEY (id);


--
-- Name: jhi_authority jhi_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.jhi_authority
    ADD CONSTRAINT jhi_authority_pkey PRIMARY KEY (name);


--
-- Name: jhi_user_authority jhi_user_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT jhi_user_authority_pkey PRIMARY KEY (user_id, authority_name);


--
-- Name: jhi_user jhi_user_pkey; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT jhi_user_pkey PRIMARY KEY (id);


--
-- Name: track track_pkey; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.track
    ADD CONSTRAINT track_pkey PRIMARY KEY (id);


--
-- Name: album ux_album__artist_id; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.album
    ADD CONSTRAINT ux_album__artist_id UNIQUE (artist_id);


--
-- Name: album ux_album__genre_id; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.album
    ADD CONSTRAINT ux_album__genre_id UNIQUE (genre_id);


--
-- Name: jhi_user ux_user_email; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_email UNIQUE (email);


--
-- Name: jhi_user ux_user_login; Type: CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_login UNIQUE (login);


--
-- Name: album fk_album__artist_id; Type: FK CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.album
    ADD CONSTRAINT fk_album__artist_id FOREIGN KEY (artist_id) REFERENCES public.artist(id);


--
-- Name: album fk_album__genre_id; Type: FK CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.album
    ADD CONSTRAINT fk_album__genre_id FOREIGN KEY (genre_id) REFERENCES public.genre(id);


--
-- Name: jhi_user_authority fk_authority_name; Type: FK CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_authority_name FOREIGN KEY (authority_name) REFERENCES public.jhi_authority(name);


--
-- Name: track fk_track__album_id; Type: FK CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.track
    ADD CONSTRAINT fk_track__album_id FOREIGN KEY (album_id) REFERENCES public.album(id);


--
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: bootifulmusic
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- PostgreSQL database dump complete
--

