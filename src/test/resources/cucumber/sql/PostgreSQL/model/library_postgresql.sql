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
-- Name: author; Type: TABLE; Schema: public; Owner: library
--

CREATE TABLE public.author (
    id bigint NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL
);


ALTER TABLE public.author OWNER TO library;

--
-- Name: book; Type: TABLE; Schema: public; Owner: library
--

CREATE TABLE public.book (
    id bigint NOT NULL,
    isbn character varying(13) NOT NULL,
    name character varying(100) NOT NULL,
    publish_year character varying(50) NOT NULL,
    copies integer NOT NULL,
    cover oid,
    cover_content_type character varying(255),
    publisher_id bigint
);


ALTER TABLE public.book OWNER TO library;

--
-- Name: borrowed_book; Type: TABLE; Schema: public; Owner: library
--

CREATE TABLE public.borrowed_book (
    id bigint NOT NULL,
    borrow_date date,
    book_id bigint,
    client_id bigint
);


ALTER TABLE public.borrowed_book OWNER TO library;

--
-- Name: client; Type: TABLE; Schema: public; Owner: library
--

CREATE TABLE public.client (
    id bigint NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    email character varying(50),
    address character varying(50),
    phone character varying(20)
);


ALTER TABLE public.client OWNER TO library;

--
-- Name: databasechangelog; Type: TABLE; Schema: public; Owner: library
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


ALTER TABLE public.databasechangelog OWNER TO library;

--
-- Name: databasechangeloglock; Type: TABLE; Schema: public; Owner: library
--

CREATE TABLE public.databasechangeloglock (
    id integer NOT NULL,
    locked boolean NOT NULL,
    lockgranted timestamp without time zone,
    lockedby character varying(255)
);


ALTER TABLE public.databasechangeloglock OWNER TO library;

--
-- Name: jhi_authority; Type: TABLE; Schema: public; Owner: library
--

CREATE TABLE public.jhi_authority (
    name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_authority OWNER TO library;

--
-- Name: jhi_user; Type: TABLE; Schema: public; Owner: library
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


ALTER TABLE public.jhi_user OWNER TO library;

--
-- Name: jhi_user_authority; Type: TABLE; Schema: public; Owner: library
--

CREATE TABLE public.jhi_user_authority (
    user_id bigint NOT NULL,
    authority_name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_user_authority OWNER TO library;

--
-- Name: publisher; Type: TABLE; Schema: public; Owner: library
--

CREATE TABLE public.publisher (
    id bigint NOT NULL,
    name character varying(100) NOT NULL
);


ALTER TABLE public.publisher OWNER TO library;

--
-- Name: rel_book__author; Type: TABLE; Schema: public; Owner: library
--

CREATE TABLE public.rel_book__author (
    author_id bigint NOT NULL,
    book_id bigint NOT NULL
);


ALTER TABLE public.rel_book__author OWNER TO library;

--
-- Name: sequence_generator; Type: SEQUENCE; Schema: public; Owner: library
--

CREATE SEQUENCE public.sequence_generator
    START WITH 1050
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.sequence_generator OWNER TO library;

--
-- Name: author author_pkey; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.author
    ADD CONSTRAINT author_pkey PRIMARY KEY (id);


--
-- Name: book book_pkey; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_pkey PRIMARY KEY (id);


--
-- Name: borrowed_book borrowed_book_pkey; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.borrowed_book
    ADD CONSTRAINT borrowed_book_pkey PRIMARY KEY (id);


--
-- Name: client client_pkey; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.client
    ADD CONSTRAINT client_pkey PRIMARY KEY (id);


--
-- Name: databasechangeloglock databasechangeloglock_pkey; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.databasechangeloglock
    ADD CONSTRAINT databasechangeloglock_pkey PRIMARY KEY (id);


--
-- Name: jhi_authority jhi_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.jhi_authority
    ADD CONSTRAINT jhi_authority_pkey PRIMARY KEY (name);


--
-- Name: jhi_user_authority jhi_user_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT jhi_user_authority_pkey PRIMARY KEY (user_id, authority_name);


--
-- Name: jhi_user jhi_user_pkey; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT jhi_user_pkey PRIMARY KEY (id);


--
-- Name: publisher publisher_pkey; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.publisher
    ADD CONSTRAINT publisher_pkey PRIMARY KEY (id);


--
-- Name: rel_book__author rel_book__author_pkey; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.rel_book__author
    ADD CONSTRAINT rel_book__author_pkey PRIMARY KEY (book_id, author_id);


--
-- Name: book ux_book__isbn; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT ux_book__isbn UNIQUE (isbn);


--
-- Name: book ux_book__publisher_id; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT ux_book__publisher_id UNIQUE (publisher_id);


--
-- Name: borrowed_book ux_borrowed_book__book_id; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.borrowed_book
    ADD CONSTRAINT ux_borrowed_book__book_id UNIQUE (book_id);


--
-- Name: borrowed_book ux_borrowed_book__client_id; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.borrowed_book
    ADD CONSTRAINT ux_borrowed_book__client_id UNIQUE (client_id);


--
-- Name: client ux_client__email; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.client
    ADD CONSTRAINT ux_client__email UNIQUE (email);


--
-- Name: publisher ux_publisher__name; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.publisher
    ADD CONSTRAINT ux_publisher__name UNIQUE (name);


--
-- Name: jhi_user ux_user_email; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_email UNIQUE (email);


--
-- Name: jhi_user ux_user_login; Type: CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_login UNIQUE (login);


--
-- Name: jhi_user_authority fk_authority_name; Type: FK CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_authority_name FOREIGN KEY (authority_name) REFERENCES public.jhi_authority(name);


--
-- Name: book fk_book__publisher_id; Type: FK CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT fk_book__publisher_id FOREIGN KEY (publisher_id) REFERENCES public.publisher(id);


--
-- Name: borrowed_book fk_borrowed_book__book_id; Type: FK CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.borrowed_book
    ADD CONSTRAINT fk_borrowed_book__book_id FOREIGN KEY (book_id) REFERENCES public.book(id);


--
-- Name: borrowed_book fk_borrowed_book__client_id; Type: FK CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.borrowed_book
    ADD CONSTRAINT fk_borrowed_book__client_id FOREIGN KEY (client_id) REFERENCES public.client(id);


--
-- Name: rel_book__author fk_rel_book__author__author_id; Type: FK CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.rel_book__author
    ADD CONSTRAINT fk_rel_book__author__author_id FOREIGN KEY (author_id) REFERENCES public.author(id);


--
-- Name: rel_book__author fk_rel_book__author__book_id; Type: FK CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.rel_book__author
    ADD CONSTRAINT fk_rel_book__author__book_id FOREIGN KEY (book_id) REFERENCES public.book(id);


--
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: library
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- PostgreSQL database dump complete
--

