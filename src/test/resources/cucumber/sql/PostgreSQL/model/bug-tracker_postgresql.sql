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
-- Name: attachment; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.attachment (
    id bigint NOT NULL,
    name character varying(255) NOT NULL,
    file oid,
    file_content_type character varying(255),
    ticket_id bigint
);


ALTER TABLE public.attachment OWNER TO jhipster;

--
-- Name: comment; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.comment (
    id bigint NOT NULL,
    date timestamp without time zone,
    text character varying(255),
    login_id bigint,
    child_id bigint
);


ALTER TABLE public.comment OWNER TO jhipster;

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
-- Name: label; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.label (
    id bigint NOT NULL,
    label character varying(255) NOT NULL
);


ALTER TABLE public.label OWNER TO jhipster;

--
-- Name: project; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.project (
    id bigint NOT NULL,
    name character varying(255)
);


ALTER TABLE public.project OWNER TO jhipster;

--
-- Name: rel_ticket__label; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.rel_ticket__label (
    label_id bigint NOT NULL,
    ticket_id bigint NOT NULL
);


ALTER TABLE public.rel_ticket__label OWNER TO jhipster;

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
-- Name: ticket; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.ticket (
    id bigint NOT NULL,
    title character varying(255) NOT NULL,
    description character varying(255),
    due_date date,
    date timestamp without time zone,
    status character varying(255),
    type character varying(255),
    priority character varying(255),
    project_id bigint,
    assigned_to_id bigint,
    reported_by_id bigint
);


ALTER TABLE public.ticket OWNER TO jhipster;

--
-- Name: attachment attachment_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.attachment
    ADD CONSTRAINT attachment_pkey PRIMARY KEY (id);


--
-- Name: comment comment_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT comment_pkey PRIMARY KEY (id);


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
-- Name: label label_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.label
    ADD CONSTRAINT label_pkey PRIMARY KEY (id);


--
-- Name: project project_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.project
    ADD CONSTRAINT project_pkey PRIMARY KEY (id);


--
-- Name: rel_ticket__label rel_ticket__label_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.rel_ticket__label
    ADD CONSTRAINT rel_ticket__label_pkey PRIMARY KEY (ticket_id, label_id);


--
-- Name: ticket ticket_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.ticket
    ADD CONSTRAINT ticket_pkey PRIMARY KEY (id);


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
-- Name: attachment fk_attachment__ticket_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.attachment
    ADD CONSTRAINT fk_attachment__ticket_id FOREIGN KEY (ticket_id) REFERENCES public.ticket(id);


--
-- Name: jhi_user_authority fk_authority_name; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_authority_name FOREIGN KEY (authority_name) REFERENCES public.jhi_authority(name);


--
-- Name: comment fk_comment__child_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT fk_comment__child_id FOREIGN KEY (child_id) REFERENCES public.comment(id);


--
-- Name: comment fk_comment__login_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT fk_comment__login_id FOREIGN KEY (login_id) REFERENCES public.jhi_user(id);


--
-- Name: rel_ticket__label fk_rel_ticket__label__label_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.rel_ticket__label
    ADD CONSTRAINT fk_rel_ticket__label__label_id FOREIGN KEY (label_id) REFERENCES public.label(id);


--
-- Name: rel_ticket__label fk_rel_ticket__label__ticket_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.rel_ticket__label
    ADD CONSTRAINT fk_rel_ticket__label__ticket_id FOREIGN KEY (ticket_id) REFERENCES public.ticket(id);


--
-- Name: ticket fk_ticket__assigned_to_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.ticket
    ADD CONSTRAINT fk_ticket__assigned_to_id FOREIGN KEY (assigned_to_id) REFERENCES public.jhi_user(id);


--
-- Name: ticket fk_ticket__project_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.ticket
    ADD CONSTRAINT fk_ticket__project_id FOREIGN KEY (project_id) REFERENCES public.project(id);


--
-- Name: ticket fk_ticket__reported_by_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.ticket
    ADD CONSTRAINT fk_ticket__reported_by_id FOREIGN KEY (reported_by_id) REFERENCES public.jhi_user(id);


--
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- PostgreSQL database dump complete
--

