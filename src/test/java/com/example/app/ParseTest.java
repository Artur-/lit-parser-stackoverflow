package com.example.app;

import java.io.IOException;

import com.vaadin.flow.component.littemplate.BundleLitParser;

import org.junit.Test;

public class ParseTest {
    private String content = """
            var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
                var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
                if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
                else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
                return c > 3 && r && Object.defineProperty(target, key, r), r;
            };
            import { customElement, html, LitElement } from "lit-element";
            let AboutView = class AboutView extends LitElement {
                render() {
                    return html `<vaadin-split-layout style="width: 100%; height: 100%;">
                  <div style="width:400px;display:flex;flex-direction:column;">
                    <div style="padding:var(--lumo-space-l);flex-grow:1;">
                      <vaadin-form-layout>
                        <vaadin-text-field
                          label="First name"
                          id="firstName"
                        ></vaadin-text-field
                        ><vaadin-text-field
                          label="Last name"
                          id="lastName"
                        ></vaadin-text-field
                        ><vaadin-date-picker
                          label="Date of birth"
                          id="dateOfBirth"
                        ></vaadin-date-picker
                        ><vaadin-text-field
                          label="Occupation"
                          id="occupation"
                        ></vaadin-text-field
                        ><vaadin-checkbox
                          id="important"
                          style="padding-top: var(--lumo-space-m);"
                          >Important</vaadin-checkbox
                        >
                      </vaadin-form-layout>
                    </div>
                    <vaadin-horizontal-layout
                      style="flex-wrap:wrap;width:100%;background-color:var(--lumo-contrast-5pct);padding:var(--lumo-space-s) var(--lumo-space-l);"
                      theme="spacing"
                    >
                      <vaadin-button theme="primary" id="save">Save</vaadin-button>
                      <vaadin-button theme="tertiary" slot="" id="cancel"
                        >Cancel</vaadin-button
                      >
                    </vaadin-horizontal-layout>
                  </div>
                </vaadin-split-layout>`;
                }
            };
            AboutView = __decorate([
                customElement("about-view")
            ], AboutView);
            export { AboutView };

            """;

    @Test
    public void parseTemplate() throws IOException {
        BundleLitParser.parseLitTemplateElement("in.ts", content);
    }
}