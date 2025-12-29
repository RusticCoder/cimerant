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
-- Name: customer_details; Type: TABLE; Schema: public; Owner: store
--

CREATE TABLE public.customer_details (
    id bigint NOT NULL,
    gender character varying(255) NOT NULL,
    phone character varying(255) NOT NULL,
    address_line_1 character varying(255) NOT NULL,
    address_line_2 character varying(255),
    city character varying(255) NOT NULL,
    country character varying(255) NOT NULL,
    user_id bigint NOT NULL
);


ALTER TABLE public.customer_details OWNER TO store;

--
-- Name: databasechangelog; Type: TABLE; Schema: public; Owner: store
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


ALTER TABLE public.databasechangelog OWNER TO store;

--
-- Name: databasechangeloglock; Type: TABLE; Schema: public; Owner: store
--

CREATE TABLE public.databasechangeloglock (
    id integer NOT NULL,
    locked boolean NOT NULL,
    lockgranted timestamp without time zone,
    lockedby character varying(255)
);


ALTER TABLE public.databasechangeloglock OWNER TO store;

--
-- Name: jhi_authority; Type: TABLE; Schema: public; Owner: store
--

CREATE TABLE public.jhi_authority (
    name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_authority OWNER TO store;

--
-- Name: jhi_user; Type: TABLE; Schema: public; Owner: store
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


ALTER TABLE public.jhi_user OWNER TO store;

--
-- Name: jhi_user_authority; Type: TABLE; Schema: public; Owner: store
--

CREATE TABLE public.jhi_user_authority (
    user_id bigint NOT NULL,
    authority_name character varying(50) NOT NULL
);


ALTER TABLE public.jhi_user_authority OWNER TO store;

--
-- Name: product; Type: TABLE; Schema: public; Owner: store
--

CREATE TABLE public.product (
    id bigint NOT NULL,
    name character varying(255) NOT NULL,
    description character varying(255),
    price numeric(21,2) NOT NULL,
    product_size character varying(255) NOT NULL,
    image oid,
    image_content_type character varying(255),
    product_category_id bigint NOT NULL
);


ALTER TABLE public.product OWNER TO store;

--
-- Name: TABLE product; Type: COMMENT; Schema: public; Owner: store
--

COMMENT ON TABLE public.product IS 'Product sold by the Online store';


--
-- Name: product_category; Type: TABLE; Schema: public; Owner: store
--

CREATE TABLE public.product_category (
    id bigint NOT NULL,
    name character varying(255) NOT NULL,
    description character varying(255)
);


ALTER TABLE public.product_category OWNER TO store;

--
-- Name: product_order; Type: TABLE; Schema: public; Owner: store
--

CREATE TABLE public.product_order (
    id bigint NOT NULL,
    quantity integer NOT NULL,
    total_price numeric(21,2) NOT NULL,
    product_id bigint NOT NULL,
    cart_id bigint NOT NULL
);


ALTER TABLE public.product_order OWNER TO store;

--
-- Name: sequence_generator; Type: SEQUENCE; Schema: public; Owner: store
--

CREATE SEQUENCE public.sequence_generator
    START WITH 1050
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.sequence_generator OWNER TO store;

--
-- Name: shopping_cart; Type: TABLE; Schema: public; Owner: store
--

CREATE TABLE public.shopping_cart (
    id bigint NOT NULL,
    placed_date timestamp without time zone NOT NULL,
    status character varying(255) NOT NULL,
    total_price numeric(21,2) NOT NULL,
    payment_method character varying(255) NOT NULL,
    payment_reference character varying(255),
    customer_details_id bigint NOT NULL
);


ALTER TABLE public.shopping_cart OWNER TO store;

--
-- Name: customer_details customer_details_pkey; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.customer_details
    ADD CONSTRAINT customer_details_pkey PRIMARY KEY (id);


--
-- Name: databasechangeloglock databasechangeloglock_pkey; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.databasechangeloglock
    ADD CONSTRAINT databasechangeloglock_pkey PRIMARY KEY (id);


--
-- Name: jhi_authority jhi_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.jhi_authority
    ADD CONSTRAINT jhi_authority_pkey PRIMARY KEY (name);


--
-- Name: jhi_user_authority jhi_user_authority_pkey; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT jhi_user_authority_pkey PRIMARY KEY (user_id, authority_name);


--
-- Name: jhi_user jhi_user_pkey; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT jhi_user_pkey PRIMARY KEY (id);


--
-- Name: product_category product_category_pkey; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.product_category
    ADD CONSTRAINT product_category_pkey PRIMARY KEY (id);


--
-- Name: product_order product_order_pkey; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.product_order
    ADD CONSTRAINT product_order_pkey PRIMARY KEY (id);


--
-- Name: product product_pkey; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);


--
-- Name: shopping_cart shopping_cart_pkey; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.shopping_cart
    ADD CONSTRAINT shopping_cart_pkey PRIMARY KEY (id);


--
-- Name: customer_details ux_customer_details__user_id; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.customer_details
    ADD CONSTRAINT ux_customer_details__user_id UNIQUE (user_id);


--
-- Name: jhi_user ux_user_email; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_email UNIQUE (email);


--
-- Name: jhi_user ux_user_login; Type: CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.jhi_user
    ADD CONSTRAINT ux_user_login UNIQUE (login);


--
-- Name: jhi_user_authority fk_authority_name; Type: FK CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_authority_name FOREIGN KEY (authority_name) REFERENCES public.jhi_authority(name);


--
-- Name: customer_details fk_customer_details__user_id; Type: FK CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.customer_details
    ADD CONSTRAINT fk_customer_details__user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- Name: product fk_product__product_category_id; Type: FK CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.product
    ADD CONSTRAINT fk_product__product_category_id FOREIGN KEY (product_category_id) REFERENCES public.product_category(id);


--
-- Name: product_order fk_product_order__cart_id; Type: FK CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.product_order
    ADD CONSTRAINT fk_product_order__cart_id FOREIGN KEY (cart_id) REFERENCES public.shopping_cart(id);


--
-- Name: product_order fk_product_order__product_id; Type: FK CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.product_order
    ADD CONSTRAINT fk_product_order__product_id FOREIGN KEY (product_id) REFERENCES public.product(id);


--
-- Name: shopping_cart fk_shopping_cart__customer_details_id; Type: FK CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.shopping_cart
    ADD CONSTRAINT fk_shopping_cart__customer_details_id FOREIGN KEY (customer_details_id) REFERENCES public.customer_details(id);


--
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: store
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- PostgreSQL database dump complete
--

