<?xml version="1.0" encoding="UTF-8"?>
<schema xmlns="http://purl.oclc.org/dsdl/schematron" queryBinding="xslt2"
    xmlns:sqf="http://www.schematron-quickfix.com/validator/process">

    <pattern id="foo">
        <rule context="foo">
            <assert test="bar">ho ho ho</assert>
        </rule>
    </pattern>


</schema>
