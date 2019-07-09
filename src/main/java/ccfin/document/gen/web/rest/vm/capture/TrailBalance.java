package ccfin.document.gen.web.rest.vm.capture;

import lombok.Value;

import java.util.List;

@Value
public class TrailBalance {
    List<TrailBalanceEntry> trailBalanceEntries;
}
