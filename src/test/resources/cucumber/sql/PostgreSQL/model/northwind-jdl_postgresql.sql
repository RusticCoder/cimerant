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
-- Name: customer; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.customer (
    id integer NOT NULL,
    company character varying(50),
    last_name character varying(50),
    first_name character varying(50),
    email_address character varying(50),
    job_title character varying(50),
    business_phone character varying(25),
    home_phone character varying(25),
    mobile_phone character varying(25),
    fax_number character varying(25),
    address text,
    city character varying(50),
    state_province character varying(50),
    zip_postal_code character varying(15),
    country_region character varying(50),
    web_page text,
    notes text,
    attachments oid,
    attachments_content_type character varying(255)
);


ALTER TABLE public.customer OWNER TO jhipster;

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
-- Name: employee; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.employee (
    id integer NOT NULL,
    company character varying(50),
    last_name character varying(50),
    first_name character varying(50),
    email_address character varying(50),
    job_title character varying(50),
    business_phone character varying(25),
    home_phone character varying(25),
    mobile_phone character varying(25),
    fax_number character varying(25),
    address text,
    city character varying(50),
    state_province character varying(50),
    zip_postal_code character varying(15),
    country_region character varying(50),
    web_page text,
    notes text,
    attachments oid,
    attachments_content_type character varying(255)
);


ALTER TABLE public.employee OWNER TO jhipster;

--
-- Name: inventory_transaction; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.inventory_transaction (
    id integer NOT NULL,
    transaction_created_date timestamp without time zone,
    transaction_modified_date timestamp without time zone,
    quantity integer NOT NULL,
    comments character varying(255)
);


ALTER TABLE public.inventory_transaction OWNER TO jhipster;

--
-- Name: inventory_transaction_type; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.inventory_transaction_type (
    id integer NOT NULL,
    type_name character varying(50) NOT NULL
);


ALTER TABLE public.inventory_transaction_type OWNER TO jhipster;

--
-- Name: invoice; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.invoice (
    id integer NOT NULL,
    invoice_date timestamp without time zone,
    due_date timestamp without time zone,
    tax numeric(21,2),
    shipping numeric(21,2),
    amount_due numeric(21,2)
);


ALTER TABLE public.invoice OWNER TO jhipster;

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
-- Name: nworder; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.nworder (
    id integer NOT NULL,
    order_date timestamp without time zone,
    shipped_date timestamp without time zone,
    ship_name character varying(50),
    ship_address text,
    ship_city character varying(50),
    ship_state_province character varying(50),
    ship_zip_postal_code character varying(50),
    ship_country_region character varying(50),
    shipping_fee numeric(21,2),
    taxes numeric(21,2),
    payment_type character varying(50),
    paid_date timestamp without time zone,
    notes text,
    tax_rate double precision
);


ALTER TABLE public.nworder OWNER TO jhipster;

--
-- Name: order_detail_statu; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.order_detail_statu (
    id integer NOT NULL,
    status_name character varying(50) NOT NULL
);


ALTER TABLE public.order_detail_statu OWNER TO jhipster;

--
-- Name: order_detailer; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.order_detailer (
    id integer NOT NULL,
    quantity numeric(21,2) NOT NULL,
    unit_price numeric(21,2),
    discount double precision NOT NULL,
    date_allocated timestamp without time zone,
    purchase_order_id integer,
    inventory_id integer
);


ALTER TABLE public.order_detailer OWNER TO jhipster;

--
-- Name: order_statu; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.order_statu (
    id integer NOT NULL,
    status_name character varying(50) NOT NULL
);


ALTER TABLE public.order_statu OWNER TO jhipster;

--
-- Name: order_tax_statu; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.order_tax_statu (
    id integer NOT NULL,
    tax_status_name character varying(50) NOT NULL
);


ALTER TABLE public.order_tax_statu OWNER TO jhipster;

--
-- Name: privilege; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.privilege (
    id integer NOT NULL,
    privilege_name character varying(50)
);


ALTER TABLE public.privilege OWNER TO jhipster;

--
-- Name: product; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.product (
    supplier_ids text,
    id integer NOT NULL,
    product_code character varying(25),
    product_name character varying(50),
    description text,
    standard_cost numeric(21,2),
    list_price numeric(21,2) NOT NULL,
    reorder_level integer,
    target_level integer,
    quantity_per_unit character varying(50),
    discontinued boolean NOT NULL,
    minimum_reorder_quantity integer,
    category character varying(50),
    attachments oid,
    attachments_content_type character varying(255)
);


ALTER TABLE public.product OWNER TO jhipster;

--
-- Name: purchase_order; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.purchase_order (
    id integer NOT NULL,
    submitted_date timestamp without time zone,
    creation_date timestamp without time zone,
    expected_date timestamp without time zone,
    shipping_fee numeric(21,2) NOT NULL,
    taxes numeric(21,2) NOT NULL,
    payment_date timestamp without time zone,
    payment_amount numeric(21,2),
    payment_method character varying(50),
    notes text,
    approved_by integer,
    approved_date timestamp without time zone,
    submitted_by integer
);


ALTER TABLE public.purchase_order OWNER TO jhipster;

--
-- Name: purchase_order_detailer; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.purchase_order_detailer (
    id integer NOT NULL,
    quantity numeric(21,2) NOT NULL,
    unit_cost numeric(21,2) NOT NULL,
    date_received timestamp without time zone,
    posted_to_inventory boolean NOT NULL
);


ALTER TABLE public.purchase_order_detailer OWNER TO jhipster;

--
-- Name: purchase_order_statu; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.purchase_order_statu (
    id integer NOT NULL,
    status character varying(50)
);


ALTER TABLE public.purchase_order_statu OWNER TO jhipster;

--
-- Name: sales_report; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.sales_report (
    id bigint NOT NULL,
    group_by character varying(50) NOT NULL,
    display character varying(50),
    title character varying(50),
    filter_row_source text,
    default_flag boolean NOT NULL
);


ALTER TABLE public.sales_report OWNER TO jhipster;

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
-- Name: shipper; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.shipper (
    id integer NOT NULL,
    company character varying(50),
    last_name character varying(50),
    first_name character varying(50),
    email_address character varying(50),
    job_title character varying(50),
    business_phone character varying(25),
    home_phone character varying(25),
    mobile_phone character varying(25),
    fax_number character varying(25),
    address text,
    city character varying(50),
    state_province character varying(50),
    zip_postal_code character varying(15),
    country_region character varying(50),
    web_page text,
    notes text,
    attachments oid,
    attachments_content_type character varying(255)
);


ALTER TABLE public.shipper OWNER TO jhipster;

--
-- Name: strings; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.strings (
    id bigint NOT NULL,
    string_id integer NOT NULL,
    string_data character varying(255)
);


ALTER TABLE public.strings OWNER TO jhipster;

--
-- Name: supplier; Type: TABLE; Schema: public; Owner: jhipster
--

CREATE TABLE public.supplier (
    id integer NOT NULL,
    company character varying(50),
    last_name character varying(50),
    first_name character varying(50),
    email_address character varying(50),
    job_title character varying(50),
    business_phone character varying(25),
    home_phone character varying(25),
    mobile_phone character varying(25),
    fax_number character varying(25),
    address text,
    city character varying(50),
    state_province character varying(50),
    zip_postal_code character varying(15),
    country_region character varying(50),
    web_page text,
    notes text,
    attachments oid,
    attachments_content_type character varying(255)
);


ALTER TABLE public.supplier OWNER TO jhipster;

--
-- Name: customer customer_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.customer
    ADD CONSTRAINT customer_pkey PRIMARY KEY (id);


--
-- Name: databasechangeloglock databasechangeloglock_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.databasechangeloglock
    ADD CONSTRAINT databasechangeloglock_pkey PRIMARY KEY (id);


--
-- Name: employee employee_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (id);


--
-- Name: inventory_transaction inventory_transaction_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.inventory_transaction
    ADD CONSTRAINT inventory_transaction_pkey PRIMARY KEY (id);


--
-- Name: inventory_transaction_type inventory_transaction_type_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.inventory_transaction_type
    ADD CONSTRAINT inventory_transaction_type_pkey PRIMARY KEY (id);


--
-- Name: invoice invoice_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.invoice
    ADD CONSTRAINT invoice_pkey PRIMARY KEY (id);


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
-- Name: nworder nworder_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.nworder
    ADD CONSTRAINT nworder_pkey PRIMARY KEY (id);


--
-- Name: order_detail_statu order_detail_statu_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.order_detail_statu
    ADD CONSTRAINT order_detail_statu_pkey PRIMARY KEY (id);


--
-- Name: order_detailer order_detailer_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.order_detailer
    ADD CONSTRAINT order_detailer_pkey PRIMARY KEY (id);


--
-- Name: order_statu order_statu_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.order_statu
    ADD CONSTRAINT order_statu_pkey PRIMARY KEY (id);


--
-- Name: order_tax_statu order_tax_statu_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.order_tax_statu
    ADD CONSTRAINT order_tax_statu_pkey PRIMARY KEY (id);


--
-- Name: privilege privilege_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.privilege
    ADD CONSTRAINT privilege_pkey PRIMARY KEY (id);


--
-- Name: product product_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);


--
-- Name: purchase_order_detailer purchase_order_detailer_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.purchase_order_detailer
    ADD CONSTRAINT purchase_order_detailer_pkey PRIMARY KEY (id);


--
-- Name: purchase_order purchase_order_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.purchase_order
    ADD CONSTRAINT purchase_order_pkey PRIMARY KEY (id);


--
-- Name: purchase_order_statu purchase_order_statu_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.purchase_order_statu
    ADD CONSTRAINT purchase_order_statu_pkey PRIMARY KEY (id);


--
-- Name: sales_report sales_report_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.sales_report
    ADD CONSTRAINT sales_report_pkey PRIMARY KEY (id);


--
-- Name: shipper shipper_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.shipper
    ADD CONSTRAINT shipper_pkey PRIMARY KEY (id);


--
-- Name: strings strings_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.strings
    ADD CONSTRAINT strings_pkey PRIMARY KEY (id);


--
-- Name: supplier supplier_pkey; Type: CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.supplier
    ADD CONSTRAINT supplier_pkey PRIMARY KEY (id);


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
-- Name: jhi_user_authority fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: jhipster
--

ALTER TABLE ONLY public.jhi_user_authority
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.jhi_user(id);


--
-- PostgreSQL database dump complete
--

