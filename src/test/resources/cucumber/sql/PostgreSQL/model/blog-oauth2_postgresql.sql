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
-- Name: blog; Type: TABLE; Schema: public; Owner: blog
--

CREATE TABLE public.blog (
    id bigint NOT NULL,
    name character varying(255) NOT NULL,
    handle character varying(255) NOT NULL,
    user_id bigint
);


ALTER TABLE public.blog OWNER TO blog;

--
-- Name: databasechangelog; Type: TABLE; Schema: public; Owner: blog
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


ALTER TABLE public.databasechangelog OWNER TO blog;

--
-- Name: databasechangeloglock; Type: TABLE; Schema: public; Owner: blog
--

CREATE TABLE public.databasechangeloglock (
    id integer NOT NULL,
    locked boolean NOT NULL,
    lockgranted timestamp without time zone,
    lockedby character varying(255)
);


ALTER TABLE public.databasechangeloglock OWNER TO blog;

--
-- Name: jhi_authority; Type: TABLE; Schema: public; Owner: blog
--

CREATE TABLE public.jhi_authority (
    name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_authority OWNER TO blog;

--
-- Name: jhi_user; Type: TABLE; Schema: public; Owner: blog
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


ALTER TABLE public.jhi_user OWNER TO blog;

--
-- Name: jhi_user_authority; Type: TABLE; Schema: public; Owner: blog
--

CREATE TABLE public.jhi_user_authority (
    user_id bigint NOT NULL,
    authority_name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_user_authority OWNER TO blog;

--
-- Name: post; Type: TABLE; Schema: public; Owner: blog
--

CREATE TABLE public.post (
    id bigint NOT NULL,
    title character varying(255) NOT NULL,
    content text NOT NULL,
    date timestamp without time zone NOT NULL,
    blog_id bigint
);


ALTER TABLE public.post OWNER TO blog;

--
-- Name: rel_post__tag; Type: TABLE; Schema: public; Owner: blog
--

CREATE TABLE public.rel_post__tag (
    tag_id bigint NOT NULL,
    post_id bigint NOT NULL
);


ALTER TABLE public.rel_post__tag OWNER TO blog;

--
-- Name: sequence_generator; Type: SEQUENCE; Schema: public; Owner: blog
--

CREATE SEQUENCE public.sequence_generator
    START WITH 1050
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.sequence_generator OWNER TO blog;

--
-- Name: tag; Type: TABLE; Schema: public; Owner: blog
--

CREATE TABLE public.tag (
    id bigint NOT NULL,
    name character varying(255) NOT NULL
);


ALTER TABLE public.tag OWNER TO blog;

--
-- Name: blog blog_pkey; Type: CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.blog
    ADD CONSTRAINT blog_pkey PRIMARY KEY (id);


--
-- Name: databasechangeloglock databasechangeloglock_pkey; Type: CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.databasechangeloglock
    ADD CONSTRAINT databasechangeloglock_pkey PRIMARY KEY (id);


--
-- Name: jhi_authority jhi_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.jhi_authority
    ADD CONSTRAINT jhi_authority_pkey PRIMARY KEY (name);


--
-- Name: jhi_user_authority jhi_user_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT jhi_user_authority_pkey PRIMARY KEY (user_id, authority_name);


--
-- Name: jhi_user jhi_user_pkey; Type: CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT jhi_user_pkey PRIMARY KEY (id);


--
-- Name: post post_pkey; Type: CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.post
    ADD CONSTRAINT post_pkey PRIMARY KEY (id);


--
-- Name: rel_post__tag rel_post__tag_pkey; Type: CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.rel_post__tag
    ADD CONSTRAINT rel_post__tag_pkey PRIMARY KEY (post_id, tag_id);


--
-- Name: tag tag_pkey; Type: CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.tag
    ADD CONSTRAINT tag_pkey PRIMARY KEY (id);


--
-- Name: jhi_user ux_user_email; Type: CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_email UNIQUE (email);


--
-- Name: jhi_user ux_user_login; Type: CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_login UNIQUE (login);


--
-- Name: jhi_user_authority fk_authority_name; Type: FK CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_authority_name FOREIGN KEY (authority_name) REFERENCES public.jhi_authority(name);


--
-- Name: blog fk_blog__user_id; Type: FK CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.blog
    ADD CONSTRAINT fk_blog__user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- Name: post fk_post__blog_id; Type: FK CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.post
    ADD CONSTRAINT fk_post__blog_id FOREIGN KEY (blog_id) REFERENCES public.blog(id);


--
-- Name: rel_post__tag fk_rel_post__tag__post_id; Type: FK CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.rel_post__tag
    ADD CONSTRAINT fk_rel_post__tag__post_id FOREIGN KEY (post_id) REFERENCES public.post(id);


--
-- Name: rel_post__tag fk_rel_post__tag__tag_id; Type: FK CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.rel_post__tag
    ADD CONSTRAINT fk_rel_post__tag__tag_id FOREIGN KEY (tag_id) REFERENCES public.tag(id);


--
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: blog
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- PostgreSQL database dump complete
--

