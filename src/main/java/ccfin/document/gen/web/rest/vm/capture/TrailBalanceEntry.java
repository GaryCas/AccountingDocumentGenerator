package ccfin.document.gen.web.rest.vm.capture;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Value
public class TrailBalanceEntry {
    @NotBlank
    String account;
    List<PeriodEntry> periodEntries;
    @NotBlank
    TrailBalanceClassification trailBalanceClassification;
}
