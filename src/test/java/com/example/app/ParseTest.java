package com.example.app;

import java.io.IOException;

import com.vaadin.flow.component.littemplate.BundleLitParser;

import org.junit.Test;

public class ParseTest {
    private String content = """
            let AboutView = class AboutView extends LitElement {
                render() {
                    return html `<vaadin-split-layout style='width: 100%; height: 100%;'>
                    <div style='padding:var(--lumo-space-l);flex-grow:1;'>
                      <vaadin-form-layout>
                        <vaadin-text-field
                          label='First name'
                          id='firstName'
                        ></vaadin-text-field
                        ><vaadin-text-field
                          label='Last name'
                          id='lastName'
                        ></vaadin-text-field
                        ><vaadin-date-picker
                          label='Date of birth'
                          id='dateOfBirth'
                        ></vaadin-date-picker
                        ><vaadin-text-field
                          label='Occupation'
                          id='occupation'
                        ></vaadin-text-field
                        >
                      </vaadin-form-layout>
                    </div>
                    <vaadin-horizontal-layout
                      style='flex-wrap:wrap;width:100%;background-color:var(--lumo-contrast-5pct);padding:var(--lumo-space-s) var(--lumo-space-l);'
                      theme='spacing'
                    >
                      <vaadin-button theme='primary' id='save'>Save</vaadin-button>
                      <vaadin-button theme='tertiary' slot='' id='cancel'
                        >Cancel</vaadin-button
                      >
                    </vaadin-horizontal-layout>
                </vaadin-split-layout>`;
                }
            };
            AboutView = __decorate([
                customElement('about-view')
            ], AboutView);
            export { AboutView };

            """;

    @Test
    public void parseTemplate() throws IOException {
        BundleLitParser.parseLitTemplateElement("in.ts", content);
    }
}